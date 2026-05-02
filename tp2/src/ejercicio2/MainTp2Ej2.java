
package ejercicio2;

import ejercicio1.BinaryTree;


public class MainTp2Ej2 {

	public static void main(String[] args) {
		//arbol sacado de la practica
		BinaryTree<Integer> ab = new BinaryTree<Integer>(40);
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(25);
		hijoIzquierdo.addLeftChild(new BinaryTree<Integer>(10));
		hijoIzquierdo.addRightChild(new BinaryTree<Integer>(32));
		BinaryTree<Integer> hijoDerecho= new BinaryTree<Integer>(78);
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho);		
        System.out.println("Cantidad de hojas: " + ab.contarHojas());
	}

}

/* arbol de ejemplo 
 * 
 *          40
 *         /  \
 *       25    78
 *      /  \
 *    10    32 
 * 
 * 
 * */
 