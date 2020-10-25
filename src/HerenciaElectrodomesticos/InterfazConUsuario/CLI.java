package InterfazConUsuario;

import Operacion.Electrodomestico;
import Operacion.Lavadora;
import Operacion.Television;

import java.util.ArrayList;

import static LecturaEscritura.Imprimir.imprimir;

public class CLI {

	public static final ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>(10);

	public static void main(String[] args) {
		int indiceLavadora = 0, indiceTelevision = 0, indiceElectrodomestico = 0;
		float precioTotal = 0, precioTotalTelevision = 0, precioTotalLavadora = 0;
		electrodomesticos.add(new Lavadora());
		electrodomesticos.add(new Lavadora(500, 35));
		electrodomesticos.add(new Lavadora(320, "Negro", 'D', 25, 10));
		electrodomesticos.add(new Television());
		electrodomesticos.add(new Television(149.99f, 20.5f));
		electrodomesticos.add(new Television(349.99f, "Rojo", 'F', 50f, 45, true));
		electrodomesticos.add(new Television(45, false));
		electrodomesticos.add(new Electrodomestico(850, 5.49f));
		electrodomesticos.add(new Electrodomestico(644, "Gris", 'C', 20));
		electrodomesticos.add(new Electrodomestico());

		for (Electrodomestico electrodomestico : electrodomesticos) {
			int indice;
			if (electrodomestico instanceof Lavadora) {
				indiceLavadora += 1;
				indice = indiceLavadora;
				precioTotalLavadora += electrodomestico.precioFinal();
			} else if (electrodomestico instanceof Television) {
				indiceTelevision += 1;
				indice = indiceTelevision;
				precioTotalTelevision += electrodomestico.precioFinal();
			} else {
				indiceElectrodomestico += 1;
				indice = indiceElectrodomestico;
			}
			imprimir(String.format("El precio de %s es de: %s \n", electrodomestico.toString(indice), electrodomestico.precioFinal()));
			precioTotal += electrodomestico.precioFinal();
		}
		imprimir("\nEl precio total de los electrodomesticos es: " + precioTotal +
				"\nEl precio total de las lavadoras es: " + precioTotalLavadora +
				"\nEl precio total de las televisiones es: " + precioTotalTelevision);
	}
}
