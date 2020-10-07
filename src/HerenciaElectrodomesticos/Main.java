package HerenciaElectrodomesticos;

import java.util.ArrayList;

import static LecturaEscritura.Imprimir.imprimir;

public class Main {

    public static ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>(10);
    public static void main(String[] args){
        int indiceLavadora=0, indiceTelevision=0, precioTotal=0, precioTotalTelevision=0,precioTotalLavadora=0;
        Lavadora lavadora1 = new Lavadora();
        Television television1 = new Television();

        electrodomesticos.add(lavadora1);
        electrodomesticos.add(television1);

        for (Electrodomestico electrodomestico : electrodomesticos){
            int indice;
            if (electrodomestico.getClass().getSimpleName().equals("Lavadora")){
                indiceLavadora+=1;
                indice=indiceLavadora;
                precioTotalLavadora+=electrodomestico.precioFinal();
            }else {
                indiceTelevision+=1;
                indice=indiceTelevision;
                precioTotalTelevision+=electrodomestico.precioFinal();
            }
            imprimir(String.format("El precio de %s es de: %s \n", electrodomestico.toString(indice), electrodomestico.precioFinal()));
            precioTotal+=electrodomestico.precioFinal();
        }
        imprimir("\nEl precio total de los electrodomesticos es: "+precioTotal+
                "\nEl precio total de las lavadoras es: "+precioTotalLavadora+
                "\nEl precio total de las televisiones es: "+precioTotalTelevision);
    }
}
