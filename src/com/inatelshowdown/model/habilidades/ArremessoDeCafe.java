package com.inatelshowdown.model.habilidade;
import com.inatelshowdown.model.Habilidade;
import com.inatelshowdown.model.Professor;

public class ArremessoDeCafe extends Habilidade {
    public ArremessoDeCafe() {
        super("Arremesso de Café", 15, 40, 0.90);
    }

    @Override
    public void usar(Professor usuario, Professor alvo) {
        if (!temPp()) {
            System.out.println("Acabou o café! (PP esgotado)");
            return;
        }
        decrementarPp();
        System.out.println(usuario.getNome() + " usou " + getNome() + "!");
        System.out.println("Ai, ardeu!");

        double chanceAcerto = getAcerto() * usuario.getAcertoBase() * (1 - alvo.getEvasao());
        if (Math.random() <= chanceAcerto) {
            int danoReal = (int) (getDano() * usuario.getModificadorAtaque());
            alvo.receberDano(danoReal);
        } else {
            System.out.println("O ataque errou!");
        }
    }
}