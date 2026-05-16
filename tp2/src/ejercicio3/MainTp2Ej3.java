package ejercicio3;

import ejercicio1.BinaryTree;
import java.util.*;

public class MainTp2Ej3 {

	public static void main(String[] args) {
		// arbol sacado de la practica
		BinaryTree<Integer> ab = new BinaryTree<Integer>(40);
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(25);
		hijoIzquierdo.addLeftChild(new BinaryTree<Integer>(10));
		hijoIzquierdo.addRightChild(new BinaryTree<Integer>(32));
		BinaryTree<Integer> hijoDerecho = new BinaryTree<Integer>(78);
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho);
		ContadorArbol listaPares = new ContadorArbol();
		listaPares.setArbol(ab);
		// La elección de InOrden o PostOrden hay que hardcodearlo 
		System.out.println("Lista de pares InOrden");
		List<Integer> lista = listaPares.numerosParesInOrden();
		if(!lista.isEmpty()) {
			for(int elem: lista) {
				System.out.print(elem + " | ");
			}
		}
		System.out.println("\n");
		System.out.println("Lista de pares PostOrden");
		lista = listaPares.numerosParesPostOrden();
		if(!lista.isEmpty()) {
			for(int elem: lista) {
				System.out.print(elem + " | ");
			}
		}
		/*
		System.out.println("Impresion preorden:");
		ab.printPreorden();
		System.out.println("Impresion inorden:");
		ab.printInorden();
		System.out.println("Impresion postorden:");
		ab.printPostorden();
		System.out.println("Impresion entre niveles TOTAL:");
		ab.printLevelTraversal();		
		*/
		

	}

}

/*
 * arbol de ejemplo
 * 
 *    40 
 *    / \ 
 *   25  78 
 *  / \ 
 * 10  32
 * 
 * 
 */
