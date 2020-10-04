package EjercicioFiguraGeométrica_Herencia;

import java.util.ArrayList;

import static LecturaEscritura.Imprimir.imprimir;

public class Main {

    public static ArrayList<Figura> figuras = new ArrayList<>();

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(5,6);
        Triangulo triangulo1 = new Triangulo(3,8);
        Romboide romboide1 = new Romboide(4,15);

        figuras.add(rectangulo1);
        figuras.add(triangulo1);
        figuras.add(romboide1);

        imprimir("Todos las figuras tienen base, altura y area.");
        for (Figura figura : figuras){
            String nombre=figura.getClass().getSimpleName();
            imprimir("\n\nLa figura "+nombre+" tiene\nBase: "+figura.getBase()+" \nAltura: "+figura.getAltura());
            figura.calcularArea();
        }
    }
}
