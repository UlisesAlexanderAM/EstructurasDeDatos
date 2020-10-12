package HerenciaElectrodomesticos;

public class Television extends Electrodomestico{
    private int resolucion;
    private boolean sintonizadorTDT;
    private final int resolucionPorDefecto = 20;
    private final boolean sintonizadorTDTPorDefecto = false;

    public Television() {
        resolucion = resolucionPorDefecto;
        sintonizadorTDT = sintonizadorTDTPorDefecto;
    }

    public Television(int resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Television(float precioBase, float peso) {
        super(precioBase, peso);
        resolucion = resolucionPorDefecto;
        sintonizadorTDT = sintonizadorTDTPorDefecto;
    }

    public Television(float precioBase, float peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Television(float precioBase, String color, char consumoEnergetico, float peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Television(float precioBase, String color, char consumoEnergetico, float peso) {
        super(precioBase, color, consumoEnergetico, peso);
        resolucion = resolucionPorDefecto;
        sintonizadorTDT = sintonizadorTDTPorDefecto;
    }

    @Override
    public float precioFinal() {
        float precio = 0;

        if (resolucion>=40){
            precio +=precioBase*0.3;
        }
        if (sintonizadorTDT=true){
            precio+=50;
        }

        return super.precioFinal()+precio;
    }

    public String toString(int num) {
        return String.format("Television{%d}", num);
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucionPorDefecto() {
        return resolucionPorDefecto;
    }

    public boolean isSintonizadorTDTPorDefecto() {
        return sintonizadorTDTPorDefecto;
    }
}
