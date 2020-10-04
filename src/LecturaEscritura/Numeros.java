package LecturaEscritura;

public class Numeros {
    protected int n1,n2,p,i,pos,neg;
    protected float num1, num2;
    public int suma(int n1, int n2){
        return n1+n2;
    }
    public int resta (int n1, int n2){
        return n1-n2;
    }
    public float division (float n1, float n2){
        return n1/n2;
    }
    public int multiplicacion(int n1, int n2){
        return n1*n2;
    }
    public void validarPosNeg(int n, int pos, int neg){
        if (n>=0){
            pos=pos+1;
            setPos(pos);
        } else {
            neg=neg+1;
            setNeg(neg);
        }
    }
    public int validarRango(int n, int rangoInferior, int rangoSuperior){
        if (n>=rangoInferior && n<=rangoSuperior){
            return 1;
        } else {
            return 0;
        }
    }
    public int validarRango(int n, int rangoInferior){
        if (n>=rangoInferior){
            return 1;
        } else {
            return 0;
        }
    }
    public void validarParesImpares(int n,int pares,int impares){
        if (n%2==0){
            p=pares+1;
            setP(p);
        } else {
            i=impares+1;
            setI(i);
        }
    }
    public int getP() {
        return p;
    }
    public int getI() {
        return i;
    }
    public void setN1(int n){
        this.n1=n;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }
    public void setNum1(float num1) {
        this.num1 = num1;
    }
    public void setNum2(float num2) {
        this.num2 = num2;
    }
    public int getN1() {
        return n1;
    }
    public int getN2() {
        return n2;
    }
    public float getNum2() {
        return num2;
    }
    public float getNum1() {
        return num1;
    }
    public int getPos() {
        return pos;
    }
    public int getNeg() {
        return neg;
    }
    public void setP(int p) {
        this.p = p;
    }
    public void setNeg(int neg) {
        this.neg = neg;
    }
    public void setI(int i) {
        this.i = i;
    }
    public void setPos(int pos) {
        this.pos = pos;
    }
}
