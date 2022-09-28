package Unidad1;

public class Ejemplo2ConversionDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float grande=1213f;
		int pequeno, edadNum;
		String edad="46";
		
		pequeno= (int) grande;
		
		//Conversion de texto string a numerico se hace utilizando la funcion valueof() del objeto numerico
		edadNum= Integer.valueOf(edad);
		
		System.out.println(pequeno);
		
		System.out.println(edadNum);
	}

}
