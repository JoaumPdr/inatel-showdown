package com.inatelshowdown.model.habilidade;
import com.inatelshowdown.model.Habilidade;
import com.inatelshowdown.model.Professor;

public class Soco extends Habilidade {
    public Soco() {
        super("Soco", 30, 35, 1.0);
    }

    @Override
    public void usar(Professor usuario, Professor alvo) {
        if (!temPp()) {
            System.out.println("Sem PP!");
            return;
        }
        decrementarPp();
        System.out.println(usuario.getNome() + " usou " + getNome() + "!");

        double chanceAcerto = getAcerto() * usuario.getAcertoBase() * (1 - alvo.getEvasao());
        if (Math.random() <= chanceAcerto) {
            int danoReal = (int) (getDano() * usuario.getModificadorAtaque());
            alvo.receberDano(danoReal);
        } else {
            System.out.println("O ataque errou!");
        }
    }
}