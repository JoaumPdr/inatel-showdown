package com.inatelshowdown.model.habilidade;
import com.inatelshowdown.model.Habilidade;
import com.inatelshowdown.model.Professor;

public class Distracao extends Habilidade {
    public Distracao() {
        super("Distração", 20, 0, 1.0);
    }

    @Override
    public void usar(Professor usuario, Professor alvo) {
        if (!temPp()) {
            System.out.println("PP esgotado!");
            return;
        }
        decrementarPp();
        System.out.println(usuario.getNome() + " usou " + getNome() + "!");

        double novoAcerto = alvo.getAcertoBase() - 0.10;
        alvo.setAcertoBase(Math.max(novoAcerto, 0.50)); // Limite mínimo
        System.out.println("O acerto de " + alvo.getNome() + " diminuiu!");
    }
}