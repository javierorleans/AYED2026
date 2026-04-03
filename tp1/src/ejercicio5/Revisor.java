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
	
	public static void maxMinIncisoB(Dato d, int num) {
		if (num < d.getMin()) {
			d.setMin(num);
		} else {
			if (num > d.getMax()) {
				d.setMax(num);
			}
		}
		
		/*
		 * d.setContador(d.getContador() + 1); d.setProm((d.getProm() + (double)num) /
		 * );
		 */
	}
	
	
}