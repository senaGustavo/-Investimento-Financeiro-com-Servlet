package Business;
public abstract class Investimentos implements IInvestimentos {
    protected float valor1;
    protected float valor2;
    protected float resultado;
    public double getResultado() {
        return resultado;
    }
    public Investimentos(float valor1){
        this.valor1=valor1;
    }
}
