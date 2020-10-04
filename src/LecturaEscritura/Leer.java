package LecturaEscritura;

import java.io.*;
import java.util.Scanner;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class Leer {
    static Console c = System.console();
    static InputStreamReader isr = new InputStreamReader (System.in);
    static BufferedReader br = new BufferedReader (isr);
    static Scanner in =new Scanner(br);
    public static int datoInt ()
    {
        try
        {
            return in.nextInt();
        }
        catch (NumberFormatException e)
        {
            return 0;
        }
    }
    public static float datoFloat ()
    {
        try
        {
            return in.nextFloat();
        }
        catch (Exception e)
        {
            return Float.NaN;
        }
    }
    public static double datoDouble ()
    {
        try
        {
            return in.nextDouble();
        }
        catch (Exception e)
        {
            return Double.NaN;
        }
    }

    public static String datoString ()
    {
        return in.next();
    }
    public static int leerEntero(String mensaje,Object... args){
        if (c==null) {
            System.out.printf(mensaje,args);
            return datoInt();
        } else {
            return parseInt(c.readLine(mensaje,args));
        }
    }
    public static int leerEntero(){
        if (c==null) {
            return datoInt();
        } else {
            return parseInt(c.readLine());
        }
    }
    public static float leerFlotante(String mensaje,Object... args){
        if (c==null) {
            System.out.printf(mensaje,args);
            return datoFloat();
        } else {
            return parseFloat(c.readLine(mensaje,args));
        }
    }
    public static String leerCadena(String mensaje,Object... args){
        if (c==null) {
            System.out.printf(mensaje,args);
            return datoString();
        } else {
            return c.readLine(mensaje,args);
        }
    }
    public static double leerDouble(String mensaje,Object... args){
        if (c==null) {
            System.out.printf(mensaje,args);
            return datoDouble();
        } else {
            return Double.parseDouble(c.readLine(mensaje,args));
        }
    }
    public static int[] leerListaNumerosEnteros(String mensaje,Object... args){
        int[] arreglo = {0};
        int i=0;
        System.out.printf(mensaje,args);
        while (in.nextInt()!=0){
            arreglo[i]=in.nextInt();
            i++;
        }
        return arreglo;
    }
    public static int[] leerListaNumerosEnterosPositivos(String mensaje,Object... args){
        int[] arreglo = {0};
        int i=0;
        System.out.printf(mensaje,args);
        while (in.nextInt()!=0 && in.nextInt()>0){
            arreglo[i]=in.nextInt();
            i++;
        }
        return arreglo;
    }
}
