import static LecturaEscritura.Imprimir.imprimir;

public class Figura {
    protected int base;
    protected int altura;
    protected float area;

    public Figura(){
    }

    public Figura(int base, int altura){
        this.base=base;
        this.altura=altura;
    }

    public void calcularArea() {
        imprimir("El area de " +this.getClass().getName()+
                " es: "+area);
    }

    public void calcularArea(int base,int altura){
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
