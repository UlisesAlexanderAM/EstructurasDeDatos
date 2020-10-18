package Operacion;

public class Romboide extends Figura {
    public Romboide(){
    }

    public Romboide(float base, float altura){
        super(base,altura);
    }

    @Override
    public double calcularArea(float base, float altura) {
        return area=base*altura;
    }
}
