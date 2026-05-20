package ejercicio4;

import ejercicio1.BinaryTree;

public class MainTp2Ej4 {

	public static void main(String[] args) {
		BinaryTree<Integer> l0 = new BinaryTree<Integer>(10); // Raiz, nivel 0
		l0.addLeftChild(new BinaryTree<Integer>(2)); // nivel 1
		l0.addRightChild(new BinaryTree<Integer>(3)); // nivel 1

		BinaryTree<Integer> l21 = new BinaryTree<Integer>(5);
		BinaryTree<Integer> l22 = new BinaryTree<Integer>(4);
		BinaryTree<Integer> l23 = new BinaryTree<Integer>(9);
		BinaryTree<Integer> l24 = new BinaryTree<Integer>(8);

		l21.addLeftChild(new BinaryTree<Integer>(7));
		l21.addRightChild(new BinaryTree<Integer>(8));

		l22.addLeftChild(new BinaryTree<Integer>(5));
		l22.addRightChild(new BinaryTree<Integer>(6));

		l23.addLeftChild(new BinaryTree<Integer>(12));
		l23.addRightChild(new BinaryTree<Integer>(8));

		l24.addLeftChild(new BinaryTree<Integer>(2));
		l24.addRightChild(new BinaryTree<Integer>(1));

		l0.getLeftChild().addLeftChild(l21);
		l0.getLeftChild().addRightChild(l22);
		l0.getRightChild().addLeftChild(l23);
		l0.getRightChild().addRightChild(l24);

		// Para comprobar que se armo bien el arbol
		/*
		 * System.out.println("Impresion entre niveles TOTAL:");
		 * l0.printLevelTraversal();
		 * 
		 * System.out.println("Impresion preorden:"); l0.printPreorden();
		 */

		RedBinariaLlena algo = new RedBinariaLlena();
		algo.setArbol(l0);

		int max = algo.retardoReenvio();

		System.out.println("Máximo retardo: " + max + " segundos.");

	}

}
