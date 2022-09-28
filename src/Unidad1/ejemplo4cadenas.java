package Unidad1;

public class ejemplo4cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String asignatura = " Programacion";
		int pos=3;
//Longitud de la cadena
System.out.println("Longitud es: " + asignatura.length());
System.out.println("Letra en Posicion: " + pos + "es" + asignatura.charAt(pos));
System.out.println(asignatura.concat("es dificil"));
System.out.println("Hola".concat(asignatura));
//Para concatenar cadenas podemos utilizar
		String horas = " tiene ocho horas semanales";
		System.out.println("La asignatura" + asignatura.concat(horas));
//Pasar una cadena a mayúsculas
		System.out.println(asignatura.toUpperCase());
	//Mostrar el caracter en una posicion en particular
	//La primera posicion empieza por 0
		System.out.println(asignatura.charAt(4));
	//Busqueda de palabras en un string
		String palabraBuscada= "Programacion";
		System.out.println("La palabra esta en la posicion " + asignatura.indexOf(palabraBuscada));
		
		System.out.println(horas.replaceAll("ocho", "diez"));
		
	}

}
