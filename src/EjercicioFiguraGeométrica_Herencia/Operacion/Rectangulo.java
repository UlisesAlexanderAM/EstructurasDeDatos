package Operacion;

public class Rectangulo extends Figura{
    public Rectangulo(){
    }
    public Rectangulo(float base, float altura){
        super(base, altura);
    }

    @Override
    public double calcularArea(float base, float altura) {
        return area=base*altura;
    }
}
