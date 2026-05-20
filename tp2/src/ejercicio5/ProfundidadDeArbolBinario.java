package ejercicio5;

import ejercicio1.BinaryTree;
import ejercicio1.Queue;

public class ProfundidadDeArbolBinario {

	BinaryTree<Integer> arbol;

	public int sumaElementosProfundidad(int p) {
		int suma = 0;
		int nivelActual = 0;
		BinaryTree<Integer> ab = null;
		Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
		cola.enqueue(arbol);
		cola.enqueue(null);
		
		while ((!cola.isEmpty()) && nivelActual <= p) {
			ab = cola.dequeue();			
			if (ab != null) {
				// Si estoy en el nivel, sumo sus nodos
				if (p == nivelActual) {
					suma += ab.getData();
				}
				if (ab.hasLeftChild()) {
					cola.enqueue(ab.getLeftChild());
				}
				if (ab.hasRightChild()) {
					cola.enqueue(ab.getRightChild());
				}
			} else if (!cola.isEmpty()) {
				++nivelActual;
				cola.enqueue(null);
			}
		}
		return suma;
	}

	public void setArbol(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	

}
