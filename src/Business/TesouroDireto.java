package Business;

public class TesouroDireto extends Investimentos {

    public TesouroDireto(float valor1) {
        super(valor1);
    }

    @Override
    public void converter(){
        resultado = valor1 *  0.65F;

    }

}
