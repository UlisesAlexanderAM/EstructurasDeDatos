package HerenciaElectrodomesticos;

import java.util.ArrayList;
import java.util.Iterator;

import static LecturaEscritura.Imprimir.imprimir;

public class Main {

    public static ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>(10);
    public static void main(String[] args){
        int indiceLavadora=0, indiceTelevision=0;
        Lavadora lavadora1 = new Lavadora();
        Television television1 = new Television();

        electrodomesticos.add(lavadora1);
        electrodomesticos.add(television1);

        Iterator<Electrodomestico> iteradorElectrodomesticos = electrodomesticos.iterator();

        for (Electrodomestico electrodomestico : electrodomesticos){
            int indice;
            if (electrodomestico.getClass().getSimpleName().equals("Lavadora")){
                indiceLavadora+=1;
                indice=indiceLavadora;
            }else {
                indiceTelevision+=1;
                indice=indiceTelevision;
            }
            imprimir(String.format("El precio de %s es de: %s \n", electrodomestico.toString(indice), electrodomestico.precioFinal()));
        }
    }
}
