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
    public double calcularArea(float base, float altura) {
        return area = (double) base * (double) altura /2;
    }

    @Override
    public float calcularPerimetro() {
        return perimetro = this.base + ladoA + ladoB;
    }
}
