package EjercicioFiguraGeométrica_Herencia;

public class Romboide extends Figura {
    public Romboide(){
    }

    public Romboide(int base, int altura){
        super(base,altura);
    }

    @Override
    public float calcularArea(int base, int altura) {
        return area=base*altura;
    }
}
