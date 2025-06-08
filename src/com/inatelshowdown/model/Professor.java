package com.inatelshowdown.model;

import java.util.List;

public class Professor {
    private String nome;
    private int hp; // hp atual
    private int hpMax;
    private List<Habilidade> habilidades;
    private double acertoBase = 1.0; // Acerto base do professor
    private double evasao = 0.0;     // Chance de 0% de evadir por padrão
    private double modificadorAtaque = 1.0; // Dano normal (1.0 = 100%) por padrão
    private boolean atordoado = false;      // Professor não começa atordoado

    public Professor(String nome, int hp, List<Habilidade> habilidades) {
        this.nome = nome;
        this.hpMax = hp;
        this.hp = hp;
        this.habilidades = habilidades;
    }

    public void usarHabilidade(int index, Professor alvo) {
        if (index >= 0 && index < this.habilidades.size()) {
            Habilidade habilidadeEscolhida = this.habilidades.get(index);
            habilidadeEscolhida.usar(this, alvo);
        } else {
            // Este erro é prevenido pela validação na classe Batalha, mas é uma boa prática manter.
            System.out.println("Escolha de habilidade inválida!");
        }
    }

    public void receberDano(int dano) {
        double danoFinal = dano / this.modificadorAtaque; // Defesa/buffs podem alterar isso
        this.hp -= (int) danoFinal;
        if (this.hp < 0) this.hp = 0;
        System.out.println(this.nome + " recebeu " + (int) danoFinal + " de dano!");
    }

    public void listarHabilidades() {
        System.out.println("Habilidades de " + this.nome + ":");
        for (int i = 0; i < this.habilidades.size(); i++) {
            Habilidade hab = this.habilidades.get(i);
            System.out.printf("%d - %s (Dano: %d, PP: %d/%d)\n",
                    i, hab.getNome(), hab.getDano(), hab.getPpAtual(), hab.getPpMax());
        }
    }

    public boolean estaVivo() {
        return this.hp > 0;
    }

    // --- Getters e Setters ---
    public String getNome() { return nome; }
    public int getHp() { return hp; }
    public int getHpMax() { return hpMax; }
    public List<Habilidade> getHabilidades() { return habilidades; }
    public double getAcertoBase() { return acertoBase; }
    public void setAcertoBase(double acertoBase) { this.acertoBase = acertoBase; }
    public double getEvasao() { return evasao; }
    public void setEvasao(double evasao) { this.evasao = evasao; }
    public double getModificadorAtaque() { return modificadorAtaque; }
    public void setModificadorAtaque(double mod) { this.modificadorAtaque = mod; }
    public boolean isAtordoado() { return atordoado; }
    public void setAtordoado(boolean atordoado) { this.atordoado = atordoado; }
    public void setHp(int hp) { this.hp = hp; }
}