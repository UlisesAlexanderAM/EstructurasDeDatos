package IntefazConUsuario;

import Operacion.*;

import java.util.ArrayList;

import static LecturaEscritura.Imprimir.imprimir;
import static LecturaEscritura.Leer.leerEntero;

public class CLI {

	public static final ArrayList<FiguraGeometrica> figuras = new ArrayList<>();

	public static void main(String[] args) {
		FiguraGeometrica rectangulo1 = new Rectangulo(5, 6);
		FiguraGeometrica triangulo1 = new Triangulo(3, 8, 5, 10);
		FiguraGeometrica romboide1 = new Romboide(4, 15, 20);

		Rectangulo rectangulo2 = new Rectangulo();
		rectangulo2.setBase(leerEntero("\nIngrese la base de " + rectangulo2.getNombre() + ": "));
		rectangulo2.setAltura(leerEntero("Ingrese la altura de " + rectangulo2.getNombre() + ": "));
		Triangulo triangulo2 = new Triangulo();
		triangulo2.setBase(leerEntero("\nIngrese la base de " + triangulo2.getNombre() + ": "));
		triangulo2.setAltura(leerEntero("Ingrese la altura de " + triangulo2.getNombre() + ": "));
		Romboide romboide2 = new Romboide();
		romboide2.setBase(leerEntero("\nIngrese la base de " + romboide2.getNombre() + ": "));
		romboide2.setAltura(leerEntero("Ingrese la altura de " + romboide2.getNombre() + ": "));

		figuras.add(rectangulo1);
		figuras.add(triangulo1);
		figuras.add(romboide1);
		figuras.add(rectangulo2);
		figuras.add(triangulo2);
		figuras.add(romboide2);

		imprimir("\nTodos las figuras tienen base, altura y area.");
		for (FiguraGeometrica figura : figuras) {
			String nombre = figura.getNombre();
			if (figura.equals(rectangulo2) || figura.equals(triangulo2) || figura.equals(romboide2)) {
				nombre += "2";
			}
			imprimir(figura.toString(nombre));
		}
	}
}
