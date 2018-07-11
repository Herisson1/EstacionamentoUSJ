package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Estacionamento.Veiculo;

/**
 * Servlet implementation class VeiculoServlet
 */
@WebServlet("/VeiculoServlet")
public class VeiculoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
			
			//Veiculo veiculo = new Veiculo();
			
			/* veiculo.setsMotorista(request.getParameter("sMotorista"));
			veiculo.setsPlaca(request.getParameter("sPlaca"));
			veiculo.setsTipoVeiculo(request.getParameter("sTipoVeiculo"));
			
			String motorista = veiculo.getsMotorista();
			String placa = veiculo.getsPlaca();
			String tipoVeiculo = veiculo.getsTipoVeiculo();
			
			
			request.setAttribute("sMotorista", motorista);
			request.setAttribute("sPlaca", placa);
			request.setAttribute("sTipoVeiculo", tipoVeiculo);*/
			
			try {
				
				
				String motorista = request.getParameter("sMotorista");
				String placa = request.getParameter("sPlaca");
				String tipoVeiculo = request.getParameter("sTipoVeiculo");
				
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Não foi possível cadastrar o veículo informado Por gentileza tente novamente mais tarde, ou entre em contato com o administrador do sistema.");
			}
				
			// System.out.println("Não foi possível cadastrar o veículo informado. Tente novamente mais tarde, ou entre em contato com o Administrador do Sistema.");
		
	}

}
