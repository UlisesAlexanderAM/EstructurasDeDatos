package HerenciaElectrodomesticos;

import java.util.ArrayList;

import static LecturaEscritura.Imprimir.imprimir;

public class Main {

    public static ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>(10);
    public static void main(String[] args){
        int indiceLavadora=0, indiceTelevision=0, indiceElectrodomestico=0;
        float precioTotal=0, precioTotalTelevision=0,precioTotalLavadora=0;
        Lavadora lavadora1 = new Lavadora();
        Lavadora lavadora2 = new Lavadora(500,35);
        Lavadora lavadora3 = new Lavadora(320,"Negro",'D',25,10);
        Television television1 = new Television();
        Television television2 = new Television(149.99f, 20.5f);
        Television television3 = new Television(349.99f, "Rojo",'F', 50f,45,true);
        Television television4 = new Television(45,false);
        Electrodomestico electrodomestico1 = new Electrodomestico(850,5.49f);
        Electrodomestico electrodomestico2 = new Electrodomestico(644,"Gris",'C',20);
        Electrodomestico electrodomestico3 = new Electrodomestico();


        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(lavadora3);
        electrodomesticos.add(television1);
        electrodomesticos.add(television2);
        electrodomesticos.add(television3);
        electrodomesticos.add(television4);
        electrodomesticos.add(electrodomestico1);
        electrodomesticos.add(electrodomestico2);
        electrodomesticos.add(electrodomestico3);

        for (Electrodomestico electrodomestico : electrodomesticos){
            int indice;
            if (electrodomestico.getClass().getSimpleName().equals("Lavadora")){
                indiceLavadora+=1;
                indice=indiceLavadora;
                precioTotalLavadora+=electrodomestico.precioFinal();
            }else if (electrodomestico.getClass().getSimpleName().equals("Television")){
                indiceTelevision+=1;
                indice=indiceTelevision;
                precioTotalTelevision+=electrodomestico.precioFinal();
            }else {
                indiceElectrodomestico+=1;
                indice=indiceElectrodomestico;
            }
            imprimir(String.format("El precio de %s es de: %s \n", electrodomestico.toString(indice), electrodomestico.precioFinal()));
            precioTotal+=electrodomestico.precioFinal();
        }
        imprimir("\nEl precio total de los electrodomesticos es: "+precioTotal+
                "\nEl precio total de las lavadoras es: "+precioTotalLavadora+
                "\nEl precio total de las televisiones es: "+precioTotalTelevision);
    }
}
