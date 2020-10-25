package Operacion;

public class Romboide extends Figura{
	private static final String NOMBRE = "Romboide";
	float lado;

	public Romboide() {
	}

	public Romboide(float base, float altura, float lado) {
		this(base,altura,NOMBRE,lado);
	}

	public Romboide(float base, float altura, String nombre, float lado) {
		super(base, altura, nombre);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return area = this.base * this.altura;
	}

	@Override
	public float calcularPerimetro() {
		return perimetro = (this.base + lado) * 2;
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
		return 0;
	}
}
