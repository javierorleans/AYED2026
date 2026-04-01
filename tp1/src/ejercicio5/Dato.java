package ejercicio5;

public class Dato {
	private int min;
	private int max;
	private double prom;

	public Dato() {
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		prom = 0.0;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public double getProm() {
		return prom;
	}

	public void setProm(double prom) {
		this.prom = prom;
	}

	@Override
	public String toString() {
		return "Min: " + getMin() + " | Max: " + getMax() + " | Prom: " + getProm();
	}

}
