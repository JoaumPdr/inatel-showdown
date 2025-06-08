package com.inatelshowdown.model.habilidade;
import com.inatelshowdown.model.Habilidade;
import com.inatelshowdown.model.Professor;

public class AtaqueDiscreto extends Habilidade {
    public AtaqueDiscreto() {
        super("Ataque Discreto", 15, 110, 0.70);
    }

    @Override
    public void usar(Professor usuario, Professor alvo) {
        if (!temPp()) {
            System.out.println("PP esgotado!");
            return;
        }
        decrementarPp();
        System.out.println(usuario.getNome() + " usou " + getNome() + "!");

        double chanceAcerto = getAcerto() * usuario.getAcertoBase() * (1 - alvo.getEvasao());
        if (Math.random() <= chanceAcerto) {
            int danoReal = (int) (getDano() * usuario.getModificadorAtaque());
            alvo.receberDano(danoReal);
        } else {
            System.out.println("O ataque foi discreto demais e errou!");
        }
    }
}