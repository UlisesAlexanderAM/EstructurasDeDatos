package Operacion;

public class Electrodomestico {

	protected double precioBase;
	private static final double PRECIO_BASE_POR_DEFECTO = 100;
	protected String color;
	private static final String COLOR_POR_DEFECTO = "Blanco";
	protected char consumoEnergetico;
	private static final char CONSUMO_ENERGETICO_POR_DEFECTO = 'F';
	protected double peso;
	private static final double PESO_POR_DEFECTO = 5;

	public Electrodomestico() {
		this(PRECIO_BASE_POR_DEFECTO, COLOR_POR_DEFECTO, CONSUMO_ENERGETICO_POR_DEFECTO, PESO_POR_DEFECTO);
	}

	public Electrodomestico(double precioBase, double peso) {
		this(precioBase,COLOR_POR_DEFECTO,CONSUMO_ENERGETICO_POR_DEFECTO,peso);
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	private char comprobarConsumoEnergetico(char letra) {
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
			return letra;
		} else {
			return 'F';
		}
	}

	private String comprobarColor(String color) {
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro")
				|| color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul")
				|| color.equalsIgnoreCase("gris")) {
			return color;
		} else {
			return "Blanco";
		}
	}

	public double precioFinal() {
		double precio = precioBase;

		if (consumoEnergetico == 'A') {
			precio += 100;
		} else if (consumoEnergetico == 'B') {
			precio += 80;
		} else if (consumoEnergetico == 'C') {
			precio += 60;
		} else if (consumoEnergetico == 'D') {
			precio += 50;
		} else if (consumoEnergetico == 'E') {
			precio += 30;
		} else {
			precio += 10;
		}

		if (peso > 0 && peso <= 19) {
			precio += 10;
		} else if (peso >= 20 && peso <= 49) {
			precio += 50;
		} else if (peso >= 50 && peso <= 79) {
			precio += 80;
		} else {
			precio += 100;
		}

		return precio;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String toString(int num) {
		return String.format("Otro electrodoméstico {%d}", num);
	}
}
