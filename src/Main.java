import java.util.ArrayList;

import static LecturaEscritura.Imprimir.imprimir;

public class Main {

    public static ArrayList<Figura> figuras = new ArrayList<>();

    public static void main(String[] args) {
        Rectangulo rectangulo1=new Rectangulo(5,6);

        figuras.add(rectangulo1);

        imprimir("Todos las figuras tienen area, base y altura.");
        for (Figura figura : figuras){
            String nombre=figura.getClass().getName();
            imprimir("La figura "+nombre+"tiene base: "+figura.getBase()+"y altura: "+figura.getAltura()+".");
            figura.calcularArea();
        }
    }
}
