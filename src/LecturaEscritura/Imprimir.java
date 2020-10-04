package LecturaEscritura;

import java.io.Console;

public class Imprimir {
    static Console c = System.console();
    public static void imprimir(String mensaje, Object... args){
        if (c==null){
            System.out.printf(mensaje,args);
        } else {
            c.printf(mensaje,args);
        }
    }
}
