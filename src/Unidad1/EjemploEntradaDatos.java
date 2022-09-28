package Unidad1;

import java.util.Scanner;

public class EjemploEntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		string nombre="";
		int edad=22;
		Scanner teclado = new Scanner(System.in);
		//Leemos cadenas de texto con next o nextline
		System.out.print("Introduce tu nombre: ");
		nombre = teclado.next();
		
		System.out.print("Introduce tu edad: ");
		edad = teclado.nextInt();
		
		
		System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");
		
		//Cerramos el objeto Scanner en la ultima linea
		teclado.close();
	}

}
