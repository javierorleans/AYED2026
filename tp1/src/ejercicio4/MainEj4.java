package ejercicio4;

public class MainEj4 {

	public static void main(String[] args) {
		int a = 1, b = 2;
		Integer c = 3, d = 4;
		SwapValores.swap1(a, b);
		SwapValores.swap2(c, d);
		System.out.println("a=" + a + " b=" + b);
		System.out.println("c=" + c + " d=" + d);
	}
}

/*
 * b) El resultado es el mismo que me dió en papel. Como todos los parámetros se
 * pasan por copia, lo que se haga con ellos dentro de los métodos no cambian a 
 * los parametros del main.
 */