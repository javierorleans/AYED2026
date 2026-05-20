package ejercicio1;

public class BinaryTree<T> {

	private T data;
	private BinaryTree<T> leftChild;
	private BinaryTree<T> rightChild;

	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * 
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}

	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * 
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty() {
		return (this.isLeaf() && this.getData() == null);
	}

	/**
	 * Devuelve True si es una hoja
	 * 
	 * @return
	 */
	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());
	}

	public boolean hasLeftChild() {
		return this.leftChild != null;
	}

	public boolean hasRightChild() {
		return this.rightChild != null;
	}

	@Override
	public String toString() {
		return this.getData().toString();
	}

	// --- BLOQUE DE IMPRESIÓN DE ÁRBOLES
	public void printPreorden() {
		System.out.print(this.getData() + " | ");
		if (this.hasLeftChild()) {
			this.getLeftChild().printPreorden();
		}
		if (this.hasRightChild()) {
			this.getRightChild().printPreorden();
		}
	}

	public void printInorden() {
		if (this.hasLeftChild()) {
			this.getLeftChild().printInorden();
		}
		System.out.println(this.getData());
		if (this.hasRightChild()) {
			this.getRightChild().printInorden();
		}
	}

	public void printPostorden() {
		if (this.hasLeftChild()) {
			this.getLeftChild().printPostorden();
		}
		if (this.hasRightChild()) {
			this.getRightChild().printPostorden();
		}
		System.out.println(this.getData());
	}

	public void printLevelTraversal() {
		BinaryTree<T> ab = null;
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null);
		while (!cola.isEmpty()) {
			ab = cola.dequeue();
			if (ab != null) {
				System.out.print(ab.getData() + " ");
				if (ab.hasLeftChild()) {
					cola.enqueue(ab.getLeftChild());
				}
				if (ab.hasRightChild()) {
					cola.enqueue(ab.getRightChild());
				}
			} else if (!cola.isEmpty()) {
				System.out.println();
				cola.enqueue(null);
			}
		}
		System.out.println();
	}

	// 0<=n<=m
	public void entreNiveles(int n, int m) {
		// Por ahora asumo que se cumple siempre que 0<=n<=m
		BinaryTree<T> ab = null;
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		int nivel = 0;
		cola.enqueue(this);
		cola.enqueue(null);
		while (!cola.isEmpty()) {
			ab = cola.dequeue();
			if (ab != null) {
				if ((n <= nivel) && (nivel <= m)) {
					System.out.print(ab.getData() + " ");
				}
				if (ab.hasLeftChild()) {
					cola.enqueue(ab.getLeftChild());
				}
				if (ab.hasRightChild()) {
					cola.enqueue(ab.getRightChild());
				}
			} else if (!cola.isEmpty()) {
				if ((n <= nivel) && (nivel <= m)) {
					System.out.println();
				}
				++nivel;
				cola.enqueue(null);
			}
		}
	}
	// -----------------------------

	public int contarHojas() {
		int total = 0;
		if (!this.isEmpty()) {
			total = contarHojas_private(this);
		}
		return total;
	}

	public BinaryTree<T> espejo() {
		if (this.isEmpty()) return new BinaryTree<T>();
		
		BinaryTree<T> nuevo = new BinaryTree<T>(this.getData());
		if(this.hasLeftChild()) {
			nuevo.addRightChild(this.getLeftChild().espejo());
		}
		if(this.hasRightChild()) {
			nuevo.addLeftChild(this.getRightChild().espejo());
		}
		
		return nuevo;
	}

	private int contarHojas_private(BinaryTree<T> arbol) {
		int suma = 0;
		if (arbol.isLeaf()) {
			suma = 1;
		} else {
			if (arbol.hasLeftChild()) {
				suma += contarHojas_private(arbol.getLeftChild());
			}
			if (arbol.hasRightChild()) {
				suma += contarHojas_private(arbol.getRightChild());
			}
		}
		return suma;
	}

}
