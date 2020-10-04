package EjercicioFiguraGeométrica_Herencia;

public class Triangulo extends Figura{

    public Triangulo(){
    }

    public Triangulo(int base, int altura){
        super(base, altura);
    }

    @Override
    public float calcularArea(int base, int altura) {
        return area=((float) base*(float) altura)/2;
    }
}
