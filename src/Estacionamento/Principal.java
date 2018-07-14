package Estacionamento;

import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) throws SQLException {
		
		
		
		
		ConexaoJdbc conx = new ConexaoJdbc("EstacionamentoUSJ","root","123456789");
		
		System.out.println(conx.buscaVeiculoPorPlaca("KKK123"));
		
		
		
		
		
		
		
		
	}

}
