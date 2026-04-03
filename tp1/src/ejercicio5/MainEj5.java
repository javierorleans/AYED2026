package ejercicio5;

public class MainEj5 {

	public static void main(String[] args) {

		int[] arrayNum = { 4, 16, 55, 23, 9, 12, 33, 10 };
		// Tiene que devolver: Min= 4; Max= 55; Prom= 20.25

		Dato infoA = Revisor.maxMinIncisoA(arrayNum);
		System.out.println("Por inciso A: " + infoA.toString());

		Dato infoB = new Dato();
		for (int num: arrayNum) {
			Revisor.maxMinIncisoB(infoB, num);
		}
		System.out.println("Por inciso B: " + infoB.toString());
	}
}
