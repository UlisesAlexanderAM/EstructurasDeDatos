package Operacion;

public class Triangulo extends Figura{
    float ladoA;
    float ladoB;

    public Triangulo(){
    }

    public Triangulo(float base, float altura, float ladoA, float ladoB){
        super(base, altura);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea() {
        return area = (double) this.base * (double) this.altura /2;
    }

    @Override
    public float calcularPerimetro() {
        return perimetro = this.base + ladoA + ladoB;
    }
}
