package Operacion;

public class Rectangulo extends Figura {

	private static final String NOMBRE = "Rectángulo";

	public Rectangulo() {
	}

	public Rectangulo(float base, float altura) {
		this(base, altura, NOMBRE);
	}

	public Rectangulo(float base, float altura, String nombre) {
		super(base, altura, nombre);
	}

	@Override
	public double calcularArea() {
		return area = this.base * this.altura;
	}

	@Override
	public float calcularPerimetro() {
		return perimetro = (this.base + this.altura) * 2;
	}

	@Override
	public String getNombre() {
		return NOMBRE;
	}

	@Override
	public double getArea() {
		return this.area;
	}

	@Override
	public float getPerimetro() {
		return this.perimetro;
	}
}
