package com.inatelshowdown.model;

public class Soco extends Habilidade {

    public Soco() { // O nome e os atributos são fixos para "Soco"
        super("Soco", 25, 10, 0.95); // Nome, PP Max, Dano, Acerto
    }

    @Override
    public void usar(Professor usuario, Professor alvo) {
        if (!temPp()) {
            System.out.println(usuario.getNome() + " tentou usar " + getNome() + ", mas não há PP suficiente!");
            return;
        }

        decrementarPp();
        System.out.println(usuario.getNome() + " usou " + getNome() + "!");

        // Lógica de acerto
        if (Math.random() <= this.getAcerto() * usuario.getAcerto()) { // Acerto da Habilidade * Acerto do Professor
            alvo.receberDano(this.getDano());
        } else {
            System.out.println(usuario.getNome() + " errou o ataque!");
        }
    }
}