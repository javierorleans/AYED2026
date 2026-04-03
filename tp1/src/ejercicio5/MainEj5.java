package ejercicio5;

public class MainEj5 {

	public static void main(String[] args) {

		int[] arrayNum = { 4, 16, 55, 23, 9, 12, 33, 10 };
		// Tiene que devolver: Min= 4; Max= 55; Prom= 20.25

		Dato infoA = Revisor.maxMinIncisoA(arrayNum);
		System.out.println("Por inciso A: " + infoA.toString());

		Dato infoB = new Dato();
		for (int num: arrayNum) {
			Revisor.maxMinIncisoB(infoB, num, arrayNum.length);
		}
		System.out.println("Por inciso B: " + infoB.toString());
		
		Revisor.resetCont();
		
		Revisor.cargaArray(arrayNum);
		
		Revisor.maxMinIncisoC();
	}
}
	
	/*Sugerido por chatgpt
	public static void main(String[] args) {

	    int[] array = {4, 16, 55, 23, 9, 12, 33, 10};

	    // Inciso A
	    Dato a = incisoA(array);
	    System.out.println("Inciso A: " + a);

	    // Inciso B
	    Dato b = new Dato();
	    incisoB(array, b);
	    System.out.println("Inciso B: " + b);

	    // Inciso C
	    cargarDatos(array);
	    incisoC();
	    }
	    */

