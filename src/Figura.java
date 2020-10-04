public class Figura {
    protected int base;
    protected int altura;

    public Figura(){
    }

    public Figura(int base, int altura){
        this.base=base;
        this.altura=altura;
    }

    public void calcularArea() {
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
