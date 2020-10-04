public class Rectangulo extends Figura{
    public Rectangulo(){
    }
    public Rectangulo(int base, int altura){
        super(base, altura);
    }

    @Override
    public void calcularArea(int base, int altura) {
        area=base*altura;
    }
}
