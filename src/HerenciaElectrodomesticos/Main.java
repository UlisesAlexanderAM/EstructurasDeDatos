package HerenciaElectrodomesticos;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>(10);
    public static void main(String[] args){
        Television television1 = new Television();

        electrodomesticos.add(television1);
    }
}
