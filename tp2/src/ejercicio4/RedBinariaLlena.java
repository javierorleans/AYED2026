package ejercicio4;

import ejercicio1.BinaryTree;

public class RedBinariaLlena {

	private BinaryTree<Integer> arbol;

	public int retardoReenvio() {
		if (arbol.isEmpty()) {
			return 0;
		} else {
			return maximoRetardo(arbol); // cambiar por el metodo recursivo
		}
	}
	
	private int maximoRetardo(BinaryTree<Integer> ab) {
		// RECORRIDO EN PROFUNDIDAD - ver al final sugerencia de chatgpt 
		int maxIzquierdo = ab.getData();
		int maxDerecho = ab.getData();
		// Si tiene HI también tiene HD y viceversa, ya que sabemos que es un árbol binario LLENO.
		if(!ab.isLeaf()) {
			maxIzquierdo += maximoRetardo(ab.getLeftChild());
			maxDerecho += maximoRetardo(ab.getRightChild());
		}		
		if(maxIzquierdo > maxDerecho) {
			return maxIzquierdo;
		} else {
			// EN CASO DE IGUALDAD, DEVUELVO EL ULTIMO MÁXIMO HALLADO
			return maxDerecho;
		}		
	}

	public void setArbol(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
		
}

/* SOLUCION POR CHATGPT
private int maximoRetardo(BinaryTree<Integer> ab) {
    if (ab.isLeaf()) {
        return ab.getData();
    }
	//SI ES UNA HOJA YA NO LLEGA A ESTE PUNTO
	// SI NO ES HOJA YA SABEMOS QUE TIENE HI E HD
    int maxIzquierdo = maximoRetardo(ab.getLeftChild());
    int maxDerecho = maximoRetardo(ab.getRightChild());

    if (maxIzquierdo > maxDerecho) {
        return ab.getData() + maxIzquierdo;
    } else {
        return ab.getData() + maxDerecho;
    }
}
*/