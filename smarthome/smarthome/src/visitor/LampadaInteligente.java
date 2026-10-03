package visitor;

public class LampadaInteligente implements DispositivoVisitable {
    private final String nome;
    private final double potenciaWatts;

    public LampadaInteligente(String nome, double potenciaWatts) {
        this.nome = nome;
        this.potenciaWatts = potenciaWatts;
    }

    public String getNome() {
        return nome;
    }

    public double getPotenciaWatts() {
        return potenciaWatts;
    }

    @Override
    public void aceitar(DispositivoVisitor visitor) {
        visitor.visitar(this);
    }
}
