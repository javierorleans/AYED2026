package ejercicio1;

public class Impresor {
	
	public static void detalleConFor(int a, int b) {
		if(a <= b) {			
			for (int j = a; j <= b ; j++) {
				System.out.println(j);
			}
		}else{			
			for (int j = a; j >= b ; j--) {
				System.out.println(j);
			}
		}
	}
	
public static void detalleConWhile(int a, int b) {
		if(a <= b) {
			while(a <= b) {
				System.out.println(a);
				a++;
			}
		}else {
			while (a >= b) {
				System.out.println(a);
				a--;
			}
			
		}
	}

public static void detalleDuro(int a, int b) {
	if (a == b) {
		System.out.println(a);
	}else {
		if(a < b) {
			System.out.println(a);
			detalleDuro(a + 1, b);
		}else{
			System.out.println(a);
			detalleDuro(a - 1, b);
		}
	}
	}
}
