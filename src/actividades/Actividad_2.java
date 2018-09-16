package actividades;

import java.util.*;
import java.util.concurrent.*;

/*
 * @Autor: Carlos Santiago Yanzon
 * @Actividad: Dado un numero n de numeros naturales ordenados crecientemente determinar
 * si un numero x pertenece al vector.
 * @Fecha: 11/09/2018
 */

public class Actividad_2 {		
	
	
	public void actividad_2() {
		int x, y;

		ArrayList<Integer> vector = new ArrayList<Integer>(10); 
		// Inicializamos variables
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		//Generamos 10 numeros aleatorios
		for(int i = 0; i < 10; i++) {
			x = ThreadLocalRandom.current().nextInt(1, 100);
			vector.add(x);
			System.out.print(vector.get(i) + " - ");
		}
		
		System.out.print("\nPre Sort:");
		for(int i = 0; i < 10; i++) {
			System.out.print(vector.get(i) + " - ");
		}

		System.out.print("\nPost Sort: ");
		Collections.sort(vector); //Ordenamos el vector
		for(int i = 0; i < 10; i++) {
			System.out.print(vector.get(i) + " - ");
		}		
		
		System.out.println("\nIngrese un numero que pertenezca: ");
		y = teclado.nextInt();
		

		//Chequeamos si el vector existe o no.
		System.out.println(pertenece(y, vector) ? "Existe" : "No existe");
	}
	
	private boolean pertenece(int numero, ArrayList<Integer> vec) {
		int max = vec.size()- 1; //Obtenemos la posicion maxima del vector
		int med = vec.size()/2 -1; //calculamos la mitad de los arreglos
		ArrayList <Integer> vecmed = new ArrayList<Integer>();
		if(numero <= vec.get(max) && numero >= (int) vec.get(0)) {
			if(med > 0) {
				if(numero == vec.get(med)) {
					return true;
				} else if (numero < vec.get(med)) {
					vecmed.addAll(vec.subList(0, med));
					return pertenece(numero, vecmed);
				} else {
					vecmed.addAll(vec.subList(med, max));
					return pertenece(numero, vecmed);
				}
			} else {
				if(numero == vec.get(0)) {
					return true;
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
		
	}
}
