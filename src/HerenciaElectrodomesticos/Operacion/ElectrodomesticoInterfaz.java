package Operacion;

public interface ElectrodomesticoInterfaz {
	char comprobarConsumoEnergetico(char letra);

	String comprobarColor(String color);

	double precioFinal();

	double getPrecioBase();

	String getColor();

	char getConsumoEnergetico();

	double getPeso();

	void setPrecioBase(double precioBase);

	void setColor(String color);

	void setConsumoEnergetico(char consumoEnergetico);

	void setPeso(double peso);

	String toString(int num);
}
