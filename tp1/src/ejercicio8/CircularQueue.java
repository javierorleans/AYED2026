package ejercicio8;

public class CircularQueue<T> extends Queue<T>{
	
	/**
	 * Permite rotar los elementos, haciéndolo circular. Retorna el elemento encolado.
	 * @return
	 */
	public T shift() {
		/* Primero desencolo el elemento. 
		 * Luego lo vuelvo a encolar y como es el último lo traigo para informar
		 * */
		enqueue(dequeue()); // Algo así como "encolar el desencolado"
		return data.getLast();
	}
}
