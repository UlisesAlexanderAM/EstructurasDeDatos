package IntefazConUsuario;

import Operacion.Figura;
import Operacion.Rectangulo;
import Operacion.Romboide;
import Operacion.Triangulo;

import java.util.ArrayList;

import static LecturaEscritura.Imprimir.imprimir;
import static LecturaEscritura.Leer.leerEntero;

public class CLI {

	public static final ArrayList<Figura> figuras = new ArrayList<>();

	public static void main(String[] args) {
		Rectangulo rectangulo1 = new Rectangulo(5, 6);
		Triangulo triangulo1 = new Triangulo(3, 8, 5, 10);
		Romboide romboide1 = new Romboide(4, 15, 20);

		Rectangulo rectangulo2 = new Rectangulo();
		rectangulo2.setBase(leerEntero("\nIngrese la base de " + rectangulo2.getClass().getSimpleName() + ": "));
		rectangulo2.setAltura(leerEntero("Ingrese la altura de " + rectangulo2.getClass().getSimpleName() + ": "));
		Triangulo triangulo2 = new Triangulo();
		triangulo2.setBase(leerEntero("\nIngrese la base de " + triangulo2.getClass().getSimpleName() + ": "));
		triangulo2.setAltura(leerEntero("Ingrese la altura de " + triangulo2.getClass().getSimpleName() + ": "));
		Romboide romboide2 = new Romboide();
		romboide2.setBase(leerEntero("\nIngrese la base de " + romboide2.getClass().getSimpleName() + ": "));
		romboide2.setAltura(leerEntero("Ingrese la altura de " + romboide2.getClass().getSimpleName() + ": "));

		figuras.add(rectangulo1);
		figuras.add(triangulo1);
		figuras.add(romboide1);
		figuras.add(rectangulo2);
		figuras.add(triangulo2);
		figuras.add(romboide2);

		imprimir("\nTodos las figuras tienen base, altura y area.");
		for (Figura figura : figuras) {
			String nombre = figura.getClass().getSimpleName();
			if (figura.equals(rectangulo2) || figura.equals(triangulo2) || figura.equals(romboide2)) {
				nombre += "2";
			}
			imprimir("\n\nLa figura " + nombre + " tiene\nBase: " + figura.getBase() + " \nAltura: " + figura.getAltura());
			imprimir(figura.mostrarArea());
			imprimir(figura.mostrarPerimetro());
		}
	}
}
