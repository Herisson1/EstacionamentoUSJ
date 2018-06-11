package Estacionamento;

import java.time.LocalDate;

import sun.util.calendar.LocalGregorianCalendar.Date;

public class Veiculo {
	
	// Variáveis
	
	private String sMotorista;
	private String sPlaca;
	private Date dDatIni;
	private Date dDatFim;
	
	
	// Construtor
	
	public Veiculo(String sMotorista, String sPlaca, Date dDatIni, Date dDatFim) {
		
		this.sMotorista = sMotorista;
		this.sPlaca = sPlaca;
		this.dDatIni = dDatIni;
		this.dDatFim = dDatFim;
		
	}

	
	// Getters e Setters
	
	public String getsMotorista() {
		return sMotorista;
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
	
	private LocalDate datEnt = LocalDate.now();
	
	private LocalDate datSai = LocalDate.now();
	

}
