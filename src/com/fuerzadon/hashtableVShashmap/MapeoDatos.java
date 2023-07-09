package com.fuerzadon.hashtableVShashmap;

import java.util.HashMap;
import java.util.Hashtable;

public class MapeoDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap: Es unestructura de datos recomendada para trabajar en un sistema que requiera un codigo
		//que se requiera clave valor.
		HashMap<Integer, String> personas = new HashMap<>();
		personas.put(123456, "Fernando Chavez");
		personas.put(987654, "Lupita Meyer");
		personas.put(741852, "Grecia Herrera");
		
		//keyset es el connjunto de llave
		//Se utiliza para crear un conjunto de elementos clave contenidos en el mapa hash.
		//Basically returns a set view of the keys or we can create a new set and store the key elements in them.
		for(Integer cedula : personas.keySet()) {
			System.out.printf("%s -> %s\n", cedula, personas.get(cedula));
		}
		
		
		// Hashtable
		System.out.println("\n\nUso de HashTable:");
		Hashtable<Integer, String> personas2 = new Hashtable<>();
		personas2.put(123456, "Fernando Chavez");
		personas2.put(987654, "Lupita Meyer");
		personas2.put(741852, "Grecia Herrera");
		
		for(Integer cedula : personas2.keySet()) {
			System.out.printf("%s -> %s\n", cedula, personas2.get(cedula));
		}
	}

}
