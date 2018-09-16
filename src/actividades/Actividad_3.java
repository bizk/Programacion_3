/**
 * 
 */
package actividades;

/**
 * @author santi
 *
 */

import java.util.*;

public class Actividad_3 {	
	private int a, b;
	private Scanner teclado = new Scanner(System.in);

	public Actividad_3() {}
	
	public void actividad () {
		System.out.println("Ingrese el numero: ");
		a = teclado.nextInt();
		System.out.println("Ingrese la potencia: ");
		b = teclado.nextInt();
		
		System.out.println();
	}
	
	public int cuadrado(int num, int pot) {
		if(pot == 1) {
			return ;
		} else {
			return (num);
		}
	}
}
