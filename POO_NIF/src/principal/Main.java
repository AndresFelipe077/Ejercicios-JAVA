package principal;

import clases.*;

public class Main {

	public static void main(String[] args) {
		
		/*Como hacerlo en tu calculadora del móvil o cualquier otra. Utilicemos el mismo número del video (78570903)
Dividimos 78570903/23= 3416126,22
Multiplicamos solo el entero 3416126x23=78570898
Ahora al número inicial (DNI) le restamos ese resultado,es decir, 
78570903-78570898=5
*/

		NIF dni = new NIF(22334455);
		System.out.println(dni);
		
		System.out.println("NOS MUESTRA EL DNI SOLO");
		System.out.println(dni.getDNI());
		
		dni.mostrarDNI();
		
		//NIF dni2 = new NIF();
		//System.out.println(dni2);
		
		
	}//Fin main
	
	

}//Fin clase Main
