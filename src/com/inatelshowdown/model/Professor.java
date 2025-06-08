package com.inatelshowdown.model;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private int hp; //hp atual
    private int hpMax;
    private List<Habilidade> habilidades;
    private EfeitoStatus efeitoStatus = null; // Professor agora pode ter um efeito de status
    private double acerto = 1.0; // Acerto base do professor

    public Professor(String nome, int hp, List<Habilidade> habilidades) {
        this.nome = nome;
        this.hp = hp;
        this.hpMax = hp;
        this.habilidades = habilidades;
    }

    public void usarHabilidade(int index, Professor alvo) {
        if (index >= 0 && index < this.habilidades.size()) {
            Habilidade habilidadeEscolhida = this.habilidades.get(index);
            habilidadeEscolhida.usar(this, alvo); // Passando o usuário (this) e o alvo
        } else {
            System.out.println("Escolha de habilidade inválida!");
        }
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public int getHp() { return hp; }
    public int getHpMax() { return hpMax; }
    public List<Habilidade> getHabilidades() { return habilidades; }
    public double getAcerto() { return acerto; }
    public EfeitoStatus getEfeitoStatus() { return efeitoStatus; }

    public void setHp(int hp) { this.hp = hp; }
    public void setAcerto(double acerto) { this.acerto = acerto; }
    public void setEfeitoStatus(EfeitoStatus efeito) { this.efeitoStatus = efeito; }

    public void receberDano(int dano) {
        this.hp -= dano;
        if (this.hp < 0) {
            this.hp = 0;
        }
        System.out.println(this.nome + " recebeu " + dano + " de dano!");
    }

    public boolean estaVivo() {
        return this.hp > 0;
    }

    public void listarHabilidades() {
        System.out.println("Habilidades de " + this.nome + ":");
        for (int i = 0; i < this.habilidades.size(); i++) {
            Habilidade hab = this.habilidades.get(i);
            System.out.printf("%d - %s (Dano: %d, PP: %d/%d)%n",
                    i, hab.getNome(), hab.getDano(), hab.getPpAtual(), hab.getPpMax());
        }
    }
}