package ejercicio8;

public class DoubleEndedQueue<T> extends Queue<T> {

	/**
	 * Permite encolar al inicio.
	 */
	public void enqueueFirst(T dato) {
		data.addFirst(dato);
	}
}
