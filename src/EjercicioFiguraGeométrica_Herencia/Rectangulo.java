package EjercicioFiguraGeométrica_Herencia;

public class Rectangulo extends Figura{
    public Rectangulo(){
    }
    public Rectangulo(int base, int altura){
        super(base, altura);
    }

    @Override
    public float calcularArea(int base, int altura) {
        return area=base*altura;
    }
}
