package Datos;

public class Pasajero {
	private int id;
	private String nombre;
	private String letra_destino;
	private boolean bajar;
	private int edad;
	private double saldo;	
	
	
	public Pasajero(int id, String nombre, String letra_destino, boolean bajar, int edad, int saldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.letra_destino = letra_destino;
		this.bajar = bajar;
		this.edad = edad;
		this.saldo = saldo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLetra_destno() {
		return letra_destino;
	}
	public void setLetra_destno(String letra_destno) {
		this.letra_destino = letra_destno;
	}
	public boolean isBajar() {
		return bajar;
	}
	public void setBajar(boolean bajar) {
		this.bajar = bajar;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double d) {
		this.saldo = d;
	}
	@Override
	public String toString() {
		return "Pasajero [id=" + id + ", nombre=" + nombre + ", letra_destno=" + letra_destino + ", bajar=" + bajar
				+ ", edad=" + edad + ", saldo=" + saldo + "]";
	}
	
	public void cobrarse() {
		
	}
	
}
