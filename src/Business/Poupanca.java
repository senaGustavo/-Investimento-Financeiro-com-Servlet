package Business;

public class Poupanca extends Investimentos{
    public Poupanca(float valor1) {
        super(valor1);
    }
    @Override
    public void converter(){
        resultado = valor1 * (1+0.38F)*valor2;

    }
}
