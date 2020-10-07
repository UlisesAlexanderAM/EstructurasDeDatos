package HerenciaElectrodomesticos;

import java.util.ArrayList;

import static LecturaEscritura.Imprimir.imprimir;

public class Main {

    public static ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>(10);
    public static void main(String[] args){
        Lavadora lavadora1 = new Lavadora();

        electrodomesticos.add(lavadora1);

        for (Electrodomestico electrodomestico : electrodomesticos){
            int indice = electrodomesticos.lastIndexOf(electrodomestico);
            imprimir(String.format("El precio de %s es de: %s", electrodomestico.toString(indice), electrodomestico.precioFinal()));
        }
    }
}
