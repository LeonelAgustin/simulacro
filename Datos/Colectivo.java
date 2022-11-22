package Datos;

public class Colectivo {
	private int id;
	private boolean encendido;
	private int boleto;
	private int recaudacion;
	private int subidas;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	public int getBoleto() {
		return boleto;
	}
	public void setBoleto(int boleto) {
		this.boleto = boleto;
	}
	public int getRecaudacion() {
		return recaudacion;
	}
	public void setRecaudacion(int recaudacion) {
		this.recaudacion = recaudacion;
	}
	public int getSubidas() {
		return subidas;
	}
	public void setSubidas(int subidas) {
		this.subidas = subidas;
	}
	@Override
	public String toString() {
		return "Colectivo [id=" + id + ", encendido=" + encendido + ", boleto=" + boleto + ", recaudacion="
				+ recaudacion + ", subidas=" + subidas + "]";
	}
	
	
}
