package Business;
public class Investimento {
    public double calcular(double capital, int meses, String tipo) {
        double taxa;
        switch (tipo) {
            case "Poupanca":  taxa = 0.38; break;
            case "CDI":       taxa = 0.53; break;
            case "TesouroDireto": taxa = 0.65; break;
            default: throw new IllegalArgumentException("Tipo inválido");
        }
        
        return capital * Math.pow(1 + (taxa / 100), meses);
    }
}