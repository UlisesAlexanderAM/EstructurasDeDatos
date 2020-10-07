package HerenciaElectrodomesticos;

public class Electrodomestico {

    protected float precioBase;
    private final float precioBasePorDefecto = 100;
    protected String color;
    private final String colorPorDefecto = "Blanco";
    protected char consumoEnergetico;
    private final char consumoEnergeticoPorDefecto = 'F';
    protected float peso;
    private final float pesoPorDefecto = 5;

    public Electrodomestico() {
        precioBase=precioBasePorDefecto;
        color=colorPorDefecto;
        consumoEnergetico=consumoEnergeticoPorDefecto;
        peso=pesoPorDefecto;
    }

    public Electrodomestico(float precioBase, float peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        consumoEnergetico=consumoEnergeticoPorDefecto;
        color=colorPorDefecto;
    }

    public Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra){
        if (letra=='A' || letra=='B' || letra=='C' || letra=='D' || letra=='E' || letra=='F'){
            return letra;
        }else {
            return 'F';
        }
    }

    private String comprobarColor(String color){
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro")
        || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul")
        || color.equalsIgnoreCase("gris")){
            return color;
        }else {
            return "Blanco";
        }
    }

    public float precioFinal(){
        float precio=precioBase;

        if (consumoEnergetico == 'A'){
            precio+=100;
        }else if (consumoEnergetico == 'B'){
            precio+=80;
        }else if (consumoEnergetico == 'C'){
            precio+=60;
        }else if (consumoEnergetico == 'D'){
            precio+=50;
        }else if (consumoEnergetico == 'E'){
            precio+=30;
        }else {
            precio+=10;
        }

        if (peso>0 && peso<=19){
            precio+=10;
        }else if (peso>=20 && peso<=49){
            precio+=50;
        }else if (peso>=50 && peso<=79){
            precio+=80;
        }else {
            precio+=100;
        }

        return precio;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

   public String toString(int num) {
        return String.format("Otro electrodoméstico {%d}", num);
    }
}
