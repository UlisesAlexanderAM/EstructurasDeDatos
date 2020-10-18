package Operacion;

public class Triangulo extends Figura{

    public Triangulo(){
    }

    public Triangulo(float base, float altura){
        super(base, altura);
    }

    @Override
    public double calcularArea(float base, float altura) {
        return area= (double) base * (double) altura /2;
    }
}
