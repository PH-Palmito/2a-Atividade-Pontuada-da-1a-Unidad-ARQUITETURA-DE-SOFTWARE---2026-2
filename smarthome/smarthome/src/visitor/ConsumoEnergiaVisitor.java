package visitor;

public class ConsumoEnergiaVisitor implements DispositivoVisitor {

    @Override
    public void visitar(LampadaInteligente lampada) {
        System.out.println(lampada.getNome() + " consome " + lampada.getPotenciaWatts() + " W.");
    }

    @Override
    public void visitar(TermostatoInteligente termostato) {
        System.out.println(termostato.getNome() + " consome " + termostato.getPotenciaWatts() + " W.");
    }

    @Override
    public void visitar(CameraSeguranca camera) {
        System.out.println(camera.getNome() + " consome " + camera.getPotenciaWatts() + " W.");
    }
}
