package visitor;

public class ManutencaoVisitor implements DispositivoVisitor {

    @Override
    public void visitar(LampadaInteligente lampada) {
        System.out.println("Verificando vida útil e conexão da " + lampada.getNome() + ".");
    }

    @Override
    public void visitar(TermostatoInteligente termostato) {
        System.out.println("Calibrando sensores do " + termostato.getNome() + ".");
    }

    @Override
    public void visitar(CameraSeguranca camera) {
        System.out.println("Verificando lente, gravação e conexão da " + camera.getNome() + ".");
    }
}
