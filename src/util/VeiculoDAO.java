package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Estacionamento.Veiculo;

public class VeiculoDAO {

	private Connection con = ConnectionFactory.getConnection();
	
	public void cadastrarVeiculo(Veiculo veiculo) {
		
		String sql = "INSERT INTO VEICULOS (Motorista, Placa, TipoVeiculos) VALUE (?, ?, ?)";
		
		
		try {
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, veiculo.getsMotorista());
			ps.setString(2, veiculo.getsPlaca());
			ps.setString(3, veiculo.getsTipoVeiculo());
			
			ps.executeQuery();
			ps.close();
			
			System.out.println("Veículo cadastrado com sucesso.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public List<Veiculo> visualizarVeiculos() {
		
		String sql = "SELECT * FROM VEICULOS";	
		
		List<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
		
		try {
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Veiculo veiculo = new Veiculo(sql, sql, sql, null, null);
				
				veiculo.setsMotorista(rs.getString("Motorista"));
				veiculo.setsPlaca(rs.getString("Placa"));
				veiculo.setsTipoVeiculo(rs.getString("TipoVeiculo"));
				
				listaVeiculos.add(veiculo);
			}
			
			ps.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listaVeiculos;
		
	}
	
	
	
}
