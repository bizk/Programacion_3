package actividades;

import java.util.*;
import java.util.concurrent.*;

public class Actividad_4 {
	private int n = 10;
	
	public void actividad() {
		List<Integer> A = new ArrayList<Integer>();
		int x;

		for (int i = 0; i < n; i++) {
			x = ThreadLocalRandom.current().nextInt(0, 2);
			A.add(x);
			System.out.print(x + " - ");
		}
		/*
		System.out.print("\n");
		auxIzq = auxIzq.subList(0, auxIzq.size()/2);
		for(int i = 0; i < auxIzq.size() ;i++) {
			System.out.print(auxIzq.get(i) + " - ");
		}
		
		System.out.print("\n");
		auxDer = auxDer.subList(auxDer.size()/2, auxDer.size());
		for(int i = 0; i < auxDer.size() ;i++) {
			System.out.print(auxDer.get(i) + " - ");
		}
		*/
		System.out.println("\n A:" + mayoritario(1, A, 1));		
	}
	
	public int mayoritario(int numero, List<Integer> vec, int z) {		
		List <Integer> izq = vec.subList(0, vec.size());
		List <Integer> der = vec.subList(0, vec.size());
		int max = vec.size();
		if(!vec.isEmpty()) {
			izq = izq.subList(0, der.size()/2-1);
			der = der.subList(der.size()/2, der.size());
			if(vec.size() > 2) {
				return z + mayoritario(numero, der, z) 
				+ mayoritario(numero, izq, z);				
			} else {
				if (numero == vec.get(0)) {
					return 1;
				}
				else
					return 0;
			}
		} else {
			return 0;
		}
	}
}
