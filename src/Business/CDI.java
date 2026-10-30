package Business;

public class CDI extends Investimentos{
    public CDI(float valor1) {
        super(valor1);
    }
    @Override
    public void converter(){
        //M = C * (1 + i)t
        resultado = valor1 * (1+0.53F)*valor2;
    }
}
