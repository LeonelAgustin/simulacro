package Interfaz;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import Datos.Colectivo;
import Datos.Pasajero;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> paradas = new LinkedList<String>();
		paradas.add("A");
		paradas.add("B");
		paradas.add("C");
		paradas.add("D");
		paradas.add("E");
		paradas.add("F");
		paradas.add("G");
		paradas.add("H");
		paradas.add("I");
		paradas.add("J");

		//char [] paradas= {'A','B','C','D','E','F','G','H','I','J'};
		//List<char> list = ['A','B','C','D','E','F','G','H','I','J'];
		
		
		LinkedList<Pasajero> pasajeros = new LinkedList<Pasajero>();
		
		Colectivo colectivo = new Colectivo(1,false,0,0,0);
		boolean terminado = true;
		colectivo.setBoleto(10);
		int a = Integer.parseInt(JOptionPane.showInputDialog("El colectivo esta apagado - precio del boleto: "+ colectivo.getBoleto() +", opciones:\n1-Encender\n2-Ver recaudacion\n3-Cambiar el precio del boleto por 1 parada"));
		
		while (terminado) {

			switch (a) {
			case 1:
				colectivo.setEncendido(true);
				terminado = false;
				int b = Integer.parseInt(JOptionPane.showInputDialog("El colectivo esta encendido y viajando, opciones:\n1-Detenerse en una parada\n2-Ver lista de pasajeros\n3-Sacar a un pasajero\n4-Ver recaudacion"));
				
				switch (b) {
				case 1:// DETENERSE
					
					pasajeros = colectivo.detenerse(paradas, pasajeros);		
					break;

				case 2:// VER LISTA
					String todos="PASAJEROS\n";
					for (Pasajero pasajero2 : pasajeros) {
						todos = todos+pasajero2.getNombre()+"\n";
					}
					JOptionPane.showMessageDialog(null, todos);
					break;
				case 3:// SACAR PASAJERO
					String sacar = JOptionPane.showInputDialog("indique el nombre del pasajero para que se baje");
					
					pasajeros.remove(pasajeros.indexOf(sacar));
					break;
				case 4:// RECAUDACION
					JOptionPane.showMessageDialog(null, "Recaudado hasta el momento: "+colectivo.getRecaudacion());
					break;
				}
				
				
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Total recaudado: "+colectivo.getRecaudacion());
				break;
			case 3:
				
				break;
			}
		}
		
		
	}

}
