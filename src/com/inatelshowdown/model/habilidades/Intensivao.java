package com.inatelshowdown.model.habilidades;
import com.inatelshowdown.model.Habilidade;
import com.inatelshowdown.model.Professor;

public class Intensivao extends Habilidade {
    public Intensivao() {
        super("Intensivão", 10, 0, 1.0);
    }

    @Override
    public void usar(Professor usuario, Professor alvo) {
        if (!temPp()) {
            System.out.println("PP esgotado!");
            return;
        }
        decrementarPp();
        System.out.println(usuario.getNome() + " usou " + getNome() + "!");

        double novoModificador = usuario.getModificadorAtaque() * 1.25;
        usuario.setModificadorAtaque(Math.min(novoModificador, 3.0)); // Limite de 3x
        System.out.println("O ataque de " + usuario.getNome() + " aumentou!");
    }
}