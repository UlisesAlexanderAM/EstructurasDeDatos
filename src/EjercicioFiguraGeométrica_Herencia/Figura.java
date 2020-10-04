package EjercicioFiguraGeométrica_Herencia;

import static LecturaEscritura.Imprimir.imprimir;

public class Figura {
    protected int base;
    protected int altura;
    protected float area;

    public Figura(){
    }

    public Figura(int base, int altura){
        this.base=base;
        this.altura=altura;
    }

    public void calcularArea() {
        imprimir("\nEl area de " +this.getClass().getSimpleName()+
                " es: "+calcularArea(base,altura));
    }

    public float calcularArea(int base,int altura){
        return area;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
