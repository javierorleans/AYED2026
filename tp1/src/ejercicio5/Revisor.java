package ejercicio5;

public class Revisor {

	private static int cont = 0;

	private static int[] array;

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
		d.setProm((double) suma / (double) arrayNum.length);
		return d;
	}

	public static void maxMinIncisoB(Dato d, int num, int longitud) {
		cont++;
		if (num < d.getMin()) {
			d.setMin(num);
		} else {
			if (num > d.getMax()) {
				d.setMax(num);
			}
		}

		d.setProm(d.getProm() + num);
		if (cont == longitud) {
			d.setProm(d.getProm() / (double) longitud);
		}

	}

	public static void resetCont() {
		cont = 0;
	}

	public static void cargaArray(int[] unArray) {
		array = unArray;
	}

	public static void maxMinIncisoC() {
		Dato d = new Dato();
		for (int num : array) {
			if (num < d.getMin()) {
				d.setMin(num);
			} else {
				if (num > d.getMax()) {
					d.setMax(num);
				}
			}
			d.setProm(d.getProm() + num);
		}
		d.setProm(d.getProm() / (double)array.length);
		System.out.println("Por inciso C: " + d.toString());
	}
}