package Operacion;

public class Lavadora extends Electrodomestico {
	private double carga;
	private final double cargaPorDefecto = 5;

	public Lavadora() {
		carga = cargaPorDefecto;
	}

	public Lavadora(double carga) {
		this.carga = carga;
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		carga = cargaPorDefecto;
	}

	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	@Override
	public double precioFinal() {
		double precio = 0;
		if (carga >= 30) {
			precio += 50;
		}
		return super.precioFinal() + precio;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	public String toString(int num) {
		return String.format("Lavadora{%d}", num);
	}

	public double getCarga() {
		return carga;
	}
}
