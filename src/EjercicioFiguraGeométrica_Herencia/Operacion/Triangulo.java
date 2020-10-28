package Operacion;

public class Triangulo extends Figura {
	private static final String NOMBRE = "Triángulo";
	float ladoA;
	float ladoB;

	public Triangulo() {
	}

	public Triangulo(float base, float altura, float ladoA, float ladoB) {
		this(base, altura, NOMBRE, ladoA, ladoB);
	}

	public Triangulo(float base, float altura, String nombre, float ladoA, float ladoB) {
		super(base, altura, nombre);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	@Override
	public double calcularArea() {
		return area = (double) this.base * (double) this.altura / 2;
	}

	@Override
	public float calcularPerimetro() {
		return perimetro = this.base + ladoA + ladoB;
	}

	@Override
	public String getNombre() {
		return NOMBRE;
	}

}
