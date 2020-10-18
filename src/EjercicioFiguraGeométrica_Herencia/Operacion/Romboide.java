package Operacion;

public class Romboide extends Figura {
    float lado;

    public Romboide(){
    }

    public Romboide(float base, float altura, float lado){
        super(base,altura);
        this.lado =lado;
    }

    @Override
    public double calcularArea(float base, float altura) {
        return area = base * altura;
    }

    @Override
    public float calcularPerimetro() {
        return perimetro = (this.base+lado)*2;
    }
}
