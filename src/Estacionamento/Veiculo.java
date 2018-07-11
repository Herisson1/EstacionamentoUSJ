package Estacionamento;

import java.time.LocalDate;

import sun.util.calendar.LocalGregorianCalendar.Date;

public class Veiculo {
	
	// Variáveis
	
	private Integer id;
	private String sMotorista;
	private String sPlaca;
	private String sTipoVeiculo;

	private Date dDatIni;
	private Date dDatFim;
	
	
	// Construtor
	
	/*public Veiculo(String sMotorista, String sPlaca, String sTipoVeiculo) {
		
		this.sMotorista = sMotorista;
		this.sPlaca = sPlaca;
		this.sTipoVeiculo = sTipoVeiculo;

	}*/

	
	// Getters e Setters
	
	
	
	public String getsMotorista() {
		return sMotorista;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setsMotorista(String sMotorista) {
		this.sMotorista = sMotorista;
	}

	public String getsPlaca() {
		return sPlaca;
	}

	public void setsPlaca(String sPlaca) {
		this.sPlaca = sPlaca;
	}

	public Date getdDatIni() {
		return dDatIni;
	}

	public void setdDatIni(Date dDatIni) {
		this.dDatIni = dDatIni;
	}

	public Date getdDatFim() {
		return dDatFim;
	}

	public void setdDatFim(Date dDatFim) {
		this.dDatFim = dDatFim;
	}
	
	public String getsTipoVeiculo() {
		return sTipoVeiculo;
	}

	public void setsTipoVeiculo(String sTipoVeiculo) {
		this.sTipoVeiculo = sTipoVeiculo;
	}
	
	
	
	private LocalDate datEnt = LocalDate.now();
	
	private LocalDate datSai = LocalDate.now();
	

}
