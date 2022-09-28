package Unidad1;

public class Ejemplo1TiposDeVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Esto es un comentario
		/*
		 * Comentario multiple
		 * jajajajajaja
		 * *******************************************/
		 //System.out.println("ejemplo1");
		//Entero sin decimales tipo int
		 int edad=13;
		 //Decimal de doble precision double
		 double pi=3.14159;
		 float notaAsignatura=4.6F;
		 //Tipo boleano verdadero o falso
		 boolean aprobado=true;
		 aprobado=false;
		 //String tipo de cadena de texto
		 String nombre="Hector tiene: ";
		 
		 char soltero='s';
		 
		 String frase = nombre + edad + "años de edad.";
		 
		 
		 edad=51;
		 //edad = 34;
		 
		System.out.println(nombre+edad);
		System.out.println(pi);
		System.out.println(aprobado);
		System.out.println(nombre);
		System.out.println(soltero);
	}

}
