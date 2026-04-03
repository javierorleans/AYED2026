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
			}
			// El primer numero ingresado va a ser minimo y maximo a la vez
			if (num > d.getMax()) {
				d.setMax(num);
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
		}

		if (num > d.getMax()) {
			d.setMax(num);
		}

		d.setProm(d.getProm() + num);
		if (cont == longitud) {
			d.setProm(d.getProm() / (double) longitud);
		}

	}
	
	/*
	 * Sugerido por chatgpt 
	 * Clave: NO usar variables globales
	 * Se resuelve en un solo llamado, no uno por número
	 * 
	 * public static void incisoB(int[] array, Dato d) { int
	 * suma = 0;
	 * 
	 * for (int num : array) { if (num < d.getMin()) { d.setMin(num); } if (num >
	 * d.getMax()) { d.setMax(num); } suma += num; }
	 * 
	 * d.setProm((double) suma / array.length); }
	 */

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
			}
			
			if (num > d.getMax()) {
				d.setMax(num);
			}
			
			d.setProm(d.getProm() + num);
		}
		d.setProm(d.getProm() / (double) array.length);
		System.out.println("Por inciso C: " + d.toString());
	}
	
	/*
	 * Sugerido por chatgpt 
	 * Se usa variable de clase (static), pero de forma simple
	 *  
	 * private static int[] datos;
	 * 
	 * public static void cargarDatos(int[] array) { datos = array; }
	 * 
	 * public static void incisoC() { Dato d = new Dato(); int suma = 0;
	 * 
	 * for (int num : datos) { if (num < d.getMin()) { d.setMin(num); } if (num >
	 * d.getMax()) { d.setMax(num); } suma += num; }
	 * 
	 * d.setProm((double) suma / datos.length); System.out.println("Inciso C: " +
	 * d); }
	 */
}