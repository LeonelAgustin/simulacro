package Datos;

public class Pasajero {
	private int id;
	private String nombre;
	private char letra_destno;
	private boolean bajar;
	private int edad;
	private int saldo;
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
	public char getLetra_destno() {
		return letra_destno;
	}
	public void setLetra_destno(char letra_destno) {
		this.letra_destno = letra_destno;
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
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Pasajero [id=" + id + ", nombre=" + nombre + ", letra_destno=" + letra_destno + ", bajar=" + bajar
				+ ", edad=" + edad + ", saldo=" + saldo + "]";
	}
	
}
