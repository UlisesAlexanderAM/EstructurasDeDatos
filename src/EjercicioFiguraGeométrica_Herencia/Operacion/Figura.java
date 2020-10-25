package Operacion;

import static LecturaEscritura.Imprimir.imprimir;

public abstract class Figura implements FiguraInterface {
	protected float base;
	protected float altura;
	protected double area;
	protected float perimetro;
	protected String nombre;

	public Figura() {
		imprimir("\n" + this.getClass().getSimpleName());
	}

	public Figura(float base, float altura, String nombre) {
		this.base = base;
		this.altura = altura;
		this.nombre = nombre;
	}

	@Override
	public String mostrarArea() {
		return "\nEl area de " + nombre +
				" es: " + calcularArea();
	}

	@Override
	public String mostrarPerimetro() {
		return "\nEl perimetro de " + nombre +
				" es: " + calcularPerimetro();
	}

	public float getAltura() {
		return altura;
	}

	public float getBase() {
		return base;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public void setBase(float base) {
		this.base = base;
	}
}
