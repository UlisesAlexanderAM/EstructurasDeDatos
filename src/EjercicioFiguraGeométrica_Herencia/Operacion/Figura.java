package Operacion;

/**
 * @author Ulises Alexander Arguelles Monjaraz <a href="mailto:ulises_alexander_am@protonmail.com">ulises_alexander_am@protonmail.com</a>
 *
 */

public abstract class Figura implements FiguraGeometrica {
	protected float base;
	protected float altura;
	protected double area;
	protected float perimetro;
	protected String nombre;

	public Figura() {}

	/**
	 * Constructor con todos los parámetros de una figura geométrica.
	 * @param base la base de la figura.
	 * @param altura la altura de la figura.
	 * @param nombre nombre de la figura.
	 */
	public Figura(float base, float altura, String nombre) {
		this.base = base;
		this.altura = altura;
		this.nombre = nombre;
	}

	/**
	 * @return Regresa el mensaje especificando el nombre de la figura geométrica y su area.
	 */
	@Override
	public String mostrarArea() {
		return "\nEl area de " + nombre +
				" es: " + getArea();
	}

	/**
	 * @return Regresa el mensaje especificando el nombre de la figura geométrica y su perímetro.
	 */
	@Override
	public String mostrarPerimetro() {
		return "\nEl perimetro de " + nombre +
				" es: " + getPerimetro();
	}

	@Override
	public abstract String getNombre();

	@Override
	public String toString() {
		return "Figura{" +
				"base=" + base +
				", altura=" + altura +
				", area=" + area +
				", perimetro=" + perimetro +
				", nombre='" + nombre + '\'' +
				'}';
	}

	@Override
	public String toString(String nombre) {
		return "Figura{" +
				"base=" + base +
				", altura=" + altura +
				", area=" + area +
				", perimetro=" + perimetro +
				", nombre='" + nombre + '\'' +
				'}';
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
