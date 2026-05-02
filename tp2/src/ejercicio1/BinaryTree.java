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

	public int contarHojas() {
		int total= 0;
		if(!this.isEmpty()) {
			total= contarHojas_private(this);
		}
		return total;
	}

	public BinaryTree<T> espejo() {

		return null;
	}

	// 0<=n<=m
	public void entreNiveles(int n, int m) {

	}
	
	private int contarHojas_private(BinaryTree<T> arbol) {
		int suma = 0;
		if(arbol.isLeaf()) {
			suma = 1;
		}else {
			if(arbol.hasLeftChild()) {
				suma += contarHojas_private(arbol.getLeftChild());
			}
			if(arbol.hasRightChild()) {
				suma += contarHojas_private(arbol.getRightChild());
			}
		}		
		return suma;
	}

}
