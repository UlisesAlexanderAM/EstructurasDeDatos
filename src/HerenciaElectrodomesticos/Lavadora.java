package HerenciaElectrodomesticos;

public class Lavadora extends Electrodomestico{
    private final float carga;
    private final float cargaPorDefecto=5;

    public Lavadora() {
        carga=cargaPorDefecto;
    }

    public Lavadora(float carga) {
        this.carga = carga;
    }

    public Lavadora(float precioBase, float peso) {
        super(precioBase, peso);
        carga=cargaPorDefecto;
    }

    public Lavadora(float precioBase, String color, char consumoEnergetico, float peso, float carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    @Override
    public float precioFinal() {
        float precio=0;
        if (carga>=30){
            precio+=50;
            return super.precioFinal()+precio;
        } else {
            return super.precioFinal()+precio;
        }
    }

    public String toString(int num) {
        return String.format("Lavadora{%d}", num);
    }

    public float getCarga() {
        return carga;
    }
}
