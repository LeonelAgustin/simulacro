package Datos;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Colectivo {
	private int id;
	private boolean encendido;
	private int boleto;
	private double recaudacion;
	private int subidas;
	
	public Colectivo(int id, boolean encendido, int boleto, int recaudacion, int subidas) {
		super();
		this.id = id;
		this.encendido = encendido;
		this.boleto = boleto;
		this.recaudacion = recaudacion;
		this.subidas = subidas;
	}
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
	public double getRecaudacion() {
		return recaudacion;
	}
	public void setRecaudacion(double d) {
		this.recaudacion = d;
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
	
	public LinkedList<Pasajero> detenerse (LinkedList<String> paradas, LinkedList<Pasajero> pasajeros) {

		String parada = JOptionPane.showInputDialog("En que parada quiere detenerse:\nA B C D E F G H I J");
		
		if (parada.equalsIgnoreCase("J")) {
			JOptionPane.showMessageDialog(null, "Final del recorrido\nrecaudacion del viaje: "+this.getRecaudacion());
			this.encendido = false;
		}
		
		int paradaActual = paradas.indexOf(parada);
		int suben = Integer.parseInt(JOptionPane.showInputDialog("cuantas personas van a subir?"));
		
		if (suben <= 50 && suben <= (50 - pasajeros.size())) {
			for (int i = 0; i < suben; i++) {
				
				String destino="";
				Pasajero pasajero = new Pasajero (1,"aux"," ",false,25,100);

				destino  = JOptionPane.showInputDialog("esta en la parada "+parada+" indique letra parada destino para cobrar el boleto correspondido para el pasajero "+i);
				
				 int edad = Integer.parseInt(JOptionPane.showInputDialog("indique su edad señor pasajero"));
				 
				 if (paradas.indexOf(destino)<=paradas.indexOf(parada)) {
					
				} else if (edad < 18 || edad > 60) {
					
					int diferencia = paradas.indexOf(destino) - paradaActual;
					double cobrar = this.getBoleto()+diferencia*5;
					
					cobrar += cobrar *0.50;
					if (pasajero.getSaldo() < cobrar) {
						JOptionPane.showMessageDialog(null, "saldo insuficiente, no puede viajar");
					} else {
						pasajero.setSaldo(pasajero.getSaldo()- cobrar);
						pasajeros.add(pasajero);
						this.setRecaudacion(this.getRecaudacion()+cobrar);
						JOptionPane.showMessageDialog(null, "El pasajero subio\npersonas en el colectivo: "+pasajeros.size()+"\nprecio del boleto (%50 decuentos) por el tramo "+parada+"-"+destino+" :"+cobrar);
					}
				} else {
					int diferencia = paradas.indexOf(destino) - paradaActual;
					double cobrar = this.getBoleto()+diferencia;
					
					if (pasajero.getSaldo() < cobrar) {
						JOptionPane.showMessageDialog(null, "saldo insuficiente, no puede viajar");
					} else {
						pasajero.setSaldo(pasajero.getSaldo()-cobrar);
						pasajeros.add(pasajero);
						this.setRecaudacion(this.getRecaudacion()+cobrar);
						JOptionPane.showMessageDialog(null, "El pasajero subio\npersonas en el colectivo: "+pasajeros.size()+"\nprecio del boleto por el tramo "+parada+"-"+destino+" :"+cobrar);
					}
				}
				
								
			}
		} else {
			
			JOptionPane.showMessageDialog(null, "No hay lugar, solo quedan "+(50-pasajeros.size())+" lugares disponibles, puede esperar otro colectivo si quiere");
		}
			return pasajeros;
	}
	
}
