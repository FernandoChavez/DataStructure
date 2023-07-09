package com.fuerzadon.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aplicacion miAplicacion = new Aplicacion();
		miAplicacion.iniciar();
	}
	
	public void iniciar() {
		Hashtable<Integer, String> tablaNombres = new Hashtable<Integer, String>();
		Hashtable<Integer, String> tablaNombres2 = new Hashtable<Integer, String>();
		
		
		
		tablaNombres.put(123, "Cristian David");
		tablaNombres.put(25, "Juan Camilo");
		tablaNombres.put(1, "Aldahir Mejias");
		tablaNombres.put(45, "Luis Fernando");
		
		System.out.println(tablaNombres);
		//tablaNombres.remove(45);
		
		
		//Aqui queremos saber si en la tabla existe el valor con la llave 25
		if(tablaNombres.containsKey(25)) {
			System.out.println("Existe");
		}else {
			System.out.println("No existe");
		}
		
		//Aqui queremos saber si en la tabla existe el valor con la llave 25
		if(tablaNombres.containsValue("Maria")) {
			System.out.println("Existe");
		}else {
			System.out.println("No existe");
		}
		
		System.out.println(tablaNombres);
		System.out.println(tablaNombres.get(123));
		System.out.println(tablaNombres.size());
		System.out.println();
		
		recorrerTablaHash(tablaNombres);
		System.out.println();
		
		//Ahora un ejemplo de como ingresar la lalve y el valor de manera manual
		for(int i = 0; i<5; i++) {
			Integer key = Integer.parseInt(JOptionPane.showInputDialog("Ingrese llave"));
			String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
			tablaNombres2.put(key, nombre);
		}
		
		recorrerTablaHash(tablaNombres2);
	}

	
	private void recorrerTablaHash(Hashtable<Integer, String> tabla) {
		// Enumeration nos ayuda a hacer un recorrido en el hashtable
		// Con .elements traera todos los elementos de la tabla y lo guardara en enumeracion
		Enumeration<String> enumeration = tabla.elements();
		Enumeration<Integer> enumerationKeys = tabla.keys();
		
		// hasMoreElements verificara si existen mas elementos en el recorrido
		while(enumeration.hasMoreElements()) {
			//String string = (String) enumeration.nextElement();
			System.out.println(+enumerationKeys.nextElement() + " - " +enumeration.nextElement());
			
		}
		
		
	}

}
