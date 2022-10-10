package clases;

import java.util.Scanner;

public class NIF {
	
	private int DNI;
	private char letra;
	
	public NIF()
	{
	}
	
	public NIF(int DNI)
	{
		this.DNI = DNI;
		leer();
	}

	public int getDNI()
	{
		return this.DNI;
	}
	
	public void setDNI(int DNI)
	{
		this.DNI = DNI;
	}
	
	/*
	public void letras()
	{
		char[] abc = {'T','R','W','A','G','M','Y','F','P','D','X','B',
				'N','J','Z','S','Q','V','H','L','C','K','E'};
		
		Como hacerlo en tu calculadora del móvil o cualquier otra. 
		Utilicemos el mismo número del video (78570903)
		Dividimos 78570903/23= 3416126,22
		Multiplicamos solo el entero 3416126x23=78570898
		Ahora al número inicial (DNI) le restamos ese resultado,es decir, 
		78570903-78570898=5 
		 
		
		//System.out.println(abc[22]);
	}
	*/
	private char leer()
	{
		char[] abc = {'T','R','W','A','G','M','Y','F','P','D','X','B',
				'N','J','Z','S','Q','V','H','L','C','K','E'};
		
		/*
		char[] abc = {'T','R','W','A','G','M','Y','F','P','D','X','B',
				'N','J','Z','S','Q','V','H','L','C','K','E'};
		
		return abc[dni % 23]
		
		*/
		
		
		Scanner entrada = new Scanner(System.in);
		int DNI;
		System.out.println("Ingrese su DNI: ");
		
		DNI = entrada.nextInt();
		
		this.DNI = DNI;
		
		//Primer division
		int primerDiv = (this.DNI / 23);
		
		//multiplicaion
		int mult = (primerDiv*23);
		
		int resta = DNI - mult;
		
		this.letra = abc[resta];
		
		return this.letra;
		
		//System.out.println(resta);
		
	}
	
	@Override
	public String toString()
	{
		return "DNI: " + DNI +
				"-" + letra;
	}
	
	
	public void mostrarDNI()
	{
		System.out.println(toString());
	}
	
}
