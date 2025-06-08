package com.inatelshowdown.model.habilidade;
import com.inatelshowdown.model.Habilidade;
import com.inatelshowdown.model.Professor;

public class MorteDaGalinha extends Habilidade {
    public MorteDaGalinha() {
        super("A Morte da Galinha", 5, 160, 0.40);
    }
    @Override
    public void usar(Professor usuario, Professor alvo) {
        if (!temPp()) {
            System.out.println("PP esgotado!");
            return;
        }
        decrementarPp();
        System.out.println(usuario.getNome() + " usou o temível ataque: " + getNome() + "!");

        double chanceAcerto = getAcerto() * usuario.getAcertoBase() * (1 - alvo.getEvasao());
        if (Math.random() <= chanceAcerto) {
            int danoReal = (int) (getDano() * usuario.getModificadorAtaque());
            alvo.receberDano(danoReal);
        } else {
            System.out.println("A galinha sobreviveu! O ataque errou!");
        }
    }
}