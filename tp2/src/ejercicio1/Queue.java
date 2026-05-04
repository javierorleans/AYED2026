package ejercicio1;

import java.util.*;

public class Queue<T> extends Sequence {
	List<T> data;

	/**
	 * Constructor de la clase
	 */
	public Queue() {
		this.data = new LinkedList<T>();
	}

	/**
	 * Inserta el elemento al final de la cola
	 * @param T dato
	 */
	public void enqueue(T dato) {
		data.add(dato);
	}

	/**
	 * Elimina el elemento del frente de la cola y lo retorna. Si la cola está vacía se produce un error.
	 * @return un elemento 
	 */
	public T dequeue() {
		return data.remove(0);
	}
	
	/**
	 * Retorna el elemento del frente de la cola. Si la cola está vacía se produce un error.
	 * @return un elemento 
	 */
	public T head() {
		return data.get(0);
	}
	
	/**
	 * Retorna la cantidad de elementos de la cola.
	 */
	@Override
	public int size() {
		return data.size();
	}
	
	/**
	 * Retorna verdadero si la cola no tiene elementos y falso en caso contrario
	 */
	@Override
	public boolean isEmpty() {
		return data.size() == 0;
	}
	
	/**
	 * Retorna los elementos de la cola en un String
	 */
	@Override
	public String toString() {
		String str = "[";
		for (T d : data)
			str = str + d + ", ";
		str = str.substring(0, str.length() - 2) + "]";
		return str;
	}

}
