package ejercicio5;

public class MainEj5 {

	public static void main(String[] args) {

		int[] arrayNum = {4, 16, 55, 23, 9, 12, 33, 10};
		// Tiene que devolver: Min= 4; Max= 55; Prom= 20.25
		
		Dato info = Revisor.maxMinIncisoA(arrayNum);
		System.out.println(info.toString());
	}

}
