package Operacion;

public interface FiguraGeometrica {
	/**
	 * @return Regresa el mensaje especificando el nombre de la figura geométrica y su area.
	 */
	String mostrarArea();

	/**
	 * @return Regresa el mensaje especificando el nombre de la figura geométrica y su perímetro.
	 */
	String mostrarPerimetro();

	/**
	 * @return Regresa el area dependiendo la formula para cada figura geométrica.
	 */
	double calcularArea();

	/**
	 * @return Regresa el perímetro dependiendo la formula para cada figura geométrica.
	 */
	float calcularPerimetro();

	/**
	 * @param nombre nombre de la figura geométrica.
	 * @return Regresa la información de la figura geométrica con un nombre personalizado.
	 */
	String toString(String nombre);

	String getNombre();

	double getArea();

	float getPerimetro();
}
