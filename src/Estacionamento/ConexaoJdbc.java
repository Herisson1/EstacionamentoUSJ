package Estacionamento;


import java.security.InvalidParameterException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Estacionamento.Veiculo;

public class ConexaoJdbc {
	private String esquemaBD;
	private String usuarioBD;
	private String senhaBD;
	private Connection conexao;

	/**
	 * 
	 * @param esquemaBD
	 * @param usuarioBD
	 * @param senhaBD
	 * @throws SQLException
	 */
	public ConexaoJdbc(String esquemaBD, String usuarioBD, String senhaBD) throws SQLException {
		this.esquemaBD = esquemaBD;
		this.usuarioBD = usuarioBD;
		this.senhaBD = senhaBD;
		this.conexao = this.conecta();
	}


	private Connection conecta() throws SQLException {
		Connection conexao = null;
		String prefixoJDBC = "jdbc";
		String tipoBD = "mysql";
		String hostBD = "localhost";
		String portaBD = "3306";
		String parametrosConexao = "useSSL=false";


		String urlBancoDeDados = prefixoJDBC + ":" + tipoBD + "://" + hostBD + ":" + portaBD + "/" + this.esquemaBD
				+ "?" + parametrosConexao;

		conexao = DriverManager.getConnection(urlBancoDeDados, this.usuarioBD, this.senhaBD);

		System.out.println("Conexao obtida: " + conexao);

		return conexao;
	}


	public boolean insere(Veiculo v) throws SQLException { 
		System.out.println("break");
		String valores = v.getsMotorista() + "," + v.getsPlaca() + "," + v.getdDatIni() + "," + v.getdDatFim();
		String colunas = "sMotorista, sPlaca, dDatIni, dDatFim";
		System.out.println("break2");
		int ret = executaInsertTabela("Veiculo", colunas, valores);		
		return ret > 0;
	}


	private int executaInsertTabela(String nomeTabela, String colunas, String valores) throws SQLException 
	{
		String comandoInsert = "INSERT INTO " + nomeTabela + "(" + colunas + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		System.out.println(comandoInsert);
		PreparedStatement prepStm = this.conexao.prepareStatement(comandoInsert);
		String [] valoresSeparados = valores.split(",");
		int indiceParametro = 1;
		for (String valor : valoresSeparados) {
			prepStm.setObject(indiceParametro, valor);
			indiceParametro++;
		}


		int ret = prepStm.executeUpdate();
		System.out.println(ret + " registro(s) inserido(s)");

		return ret;
	}


	public void fechaConexao() throws SQLException {
		if(this.conexao != null){
			this.conexao.close();
		}		
	}



	private int executaUpdateTabela(String nomeTabela, String nomeColunas, String valorColunas,
			String nomeColunasFiltro, String valoresColunasFiltro) 
					throws SQLException 
	{
		String valores = "";
		String valoresFiltro = "";
		String [] colunasSeparadas = nomeColunas.split(",");
		String [] valoresSeparados = valorColunas.split(",");

		if(colunasSeparadas.length != valoresSeparados.length) {
			throw new InvalidParameterException("Quantidade de colunas diferente da quantidade de valores");
		}

		for (int i = 0; i < colunasSeparadas.length; i++) {
			valores += ", " + colunasSeparadas[i] + " = ? ";
		}

		
		if(valores.charAt(0) == ','){
			valores = valores.substring(1);
		}

		String [] colunasFiltroSeparadas = nomeColunasFiltro.split(",");
		String [] valoresFiltroSeparados = valoresColunasFiltro.split(",");

		if(colunasFiltroSeparadas.length != valoresFiltroSeparados.length) {
			throw new InvalidParameterException("Quantidade de colunas de filtro diferente da quantidade de valores de filtro");
		}

		for (int i = 0; i < colunasFiltroSeparadas.length; i++) {
			valoresFiltro += "AND " + colunasFiltroSeparadas[i] + " = ? ";
		}

		
		if(valoresFiltro.startsWith("AND")){
			valoresFiltro = valoresFiltro.substring(3);
		}

		String comandoUpdate = "UPDATE " + nomeTabela + " SET " + valores + " WHERE " + valoresFiltro;
		
		PreparedStatement prepStm = this.conexao.prepareStatement(comandoUpdate);

		int indiceParametro = 1;
		for (String valor : valoresSeparados) {
			prepStm.setObject(indiceParametro, valor);
			indiceParametro++;
		}

		for (String valorFiltro : valoresFiltroSeparados) {
			prepStm.setObject(indiceParametro, valorFiltro);
			indiceParametro++;
		}

		int ret = prepStm.executeUpdate();

		System.out.println(ret + " registro(s) atualizado(s)");

		return ret;
	}
	
	public void alterar(Veiculo v) throws SQLException {
		String nomeTabela = "Veiculo";
		String nomeColunas = "sMotorista, sPlaca, dDatIni, dDatFim";
		String valores = v.getsMotorista() + "," + v.getsPlaca() + "," + v.getdDatIni() + "," + v.getdDatFim();
		String placa = "v.getsPlaca";
		this.executaUpdateTabela(nomeTabela, nomeColunas, valores, placa, v.getsPlaca());
		
	}

	public Veiculo buscaVeiculoPorPlaca(String placa) throws SQLException {
		String sql = "select * from Veiculo where sPlaca = '" + placa + "'";
		Statement statement = this.conexao.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		Veiculo veiculo = null;
		while(resultSet.next()) {
			String sPlaca = resultSet.getString("sPlaca");
			String id = resultSet.getString("id)");
			String sMotorista = resultSet.getString("sMotorista");
			String sTipoVeiculo = resultSet.getString("sTipoVeiculo");
			Date dDatIni = resultSet.getDate("dDatIni");
			Date dDatFim = resultSet.getDate("dDatFim");
			
			
			veiculo = new Veiculo(id, sMotorista, sTipoVeiculo, dDatIni, dDatFim);
		}
		return veiculo;

	}

	
	public int deletar(String placa) throws SQLException {
		String sql = "delete from Veiculo where sPlaca = ?";
		PreparedStatement prepareStatement = this.conexao.prepareStatement(sql);
		prepareStatement.setString(1, placa);
		int executou = prepareStatement.executeUpdate();
		return executou;
	}


	

}


