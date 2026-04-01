package ejercicio5;

public class Revisor {

	public static Dato maxMinIncisoA(int[] arrayNum) {
		Dato d = new Dato();
		int suma = 0;
		for (int num : arrayNum) {
			if (num < d.getMin()) {
				d.setMin(num);
			} else {
				if (num > d.getMax()) {
					d.setMax(num);
				}
			}
			suma += num;
		}
		d.setProm((double)suma / (double)arrayNum.length);
		return d;
	}
}