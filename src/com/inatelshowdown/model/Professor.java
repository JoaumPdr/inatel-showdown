package com.inatelshowdown.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Professor {
    private String nome;
    private int hp; // hp atual
    private int hpMax;
    private List<Habilidade> habilidades;
    private double acerto = 1.0; // Acerto base do professor
    private double evasao = 0.0;     // Chance de 0% de evadir por padrão
    private double modificadorAtaque = 1.0; // Dano normal (1.0 = 100%) por padrão
    private boolean atordoado = false;      // Professor não começa atordoado
    private List<EfeitoStatus> efeitosStatus = new ArrayList<>(); // Lista de efeitos ativos

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
            System.out.println("Escolha de habilidade inválida!");
        }
    }

    public void receberDano(int dano) {
        // O cálculo do dano foi removido daqui para evitar dupla aplicação de modificadores.
        // Agora o dano é calculado na habilidade e este metodo apenas o aplica.
        this.hp -= dano;
        if (this.hp < 0) this.hp = 0;
        System.out.println(this.nome + " recebeu " + dano + " de dano!");
    }

    // --- Lógica de Efeitos de Status ---
    public void adicionarEfeito(EfeitoStatus efeito) {
        this.efeitosStatus.add(efeito);
        efeito.aplicar(this);
    }

    public void atualizarEfeitos() {
        // Usamos um Iterator para remover efeitos da lista enquanto iteramos sobre ela
        Iterator<EfeitoStatus> iterator = efeitosStatus.iterator();
        while (iterator.hasNext()) {
            EfeitoStatus efeito = iterator.next();
            efeito.atualizar(this);
            if (efeito.terminou()) {
                efeito.remover(this);
                iterator.remove(); // Remove o efeito da lista
            }
        }
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
    public double getAcerto() { return acerto; }
    public void setAcerto(double acerto) { this.acerto = acerto; }
    public double getEvasao() { return evasao; }
    public void setEvasao(double evasao) { this.evasao = evasao; }
    public double getModificadorAtaque() { return modificadorAtaque; }
    public void setModificadorAtaque(double mod) { this.modificadorAtaque = mod; }
    public boolean isAtordoado() { return atordoado; }
    public void setAtordoado(boolean atordoado) { this.atordoado = atordoado; }
    public void setHp(int hp) { this.hp = hp; }
}