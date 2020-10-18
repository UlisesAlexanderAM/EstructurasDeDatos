package Operacion;

import static LecturaEscritura.Imprimir.imprimir;

public abstract class Figura {
    protected float base;
    protected float altura;
    protected double area;
    protected float perimetro;

    public Figura(){
        imprimir("\n"+this.getClass().getSimpleName());
    }

    public Figura(float base, float altura){
        this.base=base;
        this.altura=altura;
    }

    public void mostrarArea() {
        imprimir("\nEl area de " +this.getClass().getSimpleName()+
                " es: "+calcularArea(base, altura));
    }

    public void mostrarPerimetro(){
        imprimir("\nEl perimetro de " +this.getClass().getSimpleName()+
                " es: "+calcularPerimetro());
    }

    public abstract double calcularArea(float base, float altura);

    public abstract float calcularPerimetro();

    public float getAltura() {
        return altura;
    }

    public float getBase() {
        return base;
    }

    public double getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
