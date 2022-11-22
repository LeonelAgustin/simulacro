package Interfaz;

import java.util.LinkedList;

import javax.swing.JOptionPane;

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
		int posAct=0;
		String destino;
		LinkedList<Pasajero> pasajeros = new LinkedList<Pasajero>();
		int a = Integer.parseInt(JOptionPane.showInputDialog("El colectivo esta apagado, solo puede:\n1-Encender\n2Ver recaudacion\n3-"));
		
		if (a==1) {
			String parar = JOptionPane.showInputDialog("el colectivo esta viajando, en que parada quiere detenerse:\nA B C D E F G H I J");
			posAct = paradas.indexOf(parar);
			String suben = JOptionPane.showInputDialog("cuantas personas van a subir?");
			destino = JOptionPane.showInputDialog("indique letra parada destino");
		}
		
		
	}

}
