package Unidad1;

public class Ejemplo3Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0, y=5;
		
		System.out.println("La suma es: " + (x+y));
		System.out.println(x-y);
		System.out.println("El resultado es: "+(x+y)/y);
		//Si ponemos parentesis primero realiza el calculo de dentro
		System.out.println(x+y/y);
		//Sino ejecuta la operacion de mayor prioridad, entre las basicas
		//La prioridad es * / + -
		System.out.println(x*y);
		//x++ operador de incremento aumenta en uno el valor numérico de la variable
		//y-- restarle uno
		System.out.println(x++);
		System.out.println(y--);
		System.out.println("El resultado es: " + (x=y++));
		
		int cantidad=9;
		//Muestra por pantalla 9 ya que el incremento se hace despues
		System.out.println(cantidad++);
		
		//Para generar un numero aleatorio utilizamos Math.random()
		
		double aleatorio = Math.random();
		
		System.out.println("El numero aleatorio por defecto es " + (int)(aleatorio*20+1));
		//Solo va a hacer de 0 a 19
		
		int numMelones = (int)(Math.random()*100+1);
		System.out.println("Hay " + numMelones + " y su modulo es " + numMelones%2);
	}

}
