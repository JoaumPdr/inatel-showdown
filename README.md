<div align="center">

# ✨ Inatel Showdown (v1.0) ✨

</div>

<div align="center">

Um jogo de batalha épico em turnos com os seus professores favoritos do Inatel!

</div>

---

## 🎮 Como Jogar

O jogo é simples e direto. Siga os passos abaixo para começar a sua jornada:

1.  **Selecione seu Professor:**
    * Escolha um professor da lista para ser o seu campeão.
    * Analise os status e as habilidades de cada um para montar a sua estratégia.

2.  **Desafie um Oponente:**
    * Escolha um oponente da lista para a batalha.
    * Você pode ver os status do seu adversário antes de confirmar o combate.

3.  **Que comece a Batalha!**
    * A batalha é por turnos. No seu turno, escolha uma das suas habilidades para atacar ou aplicar efeitos no oponente.
    * Fique de olho no seu **HP** e nos **PPs** (Pontos de Poder) das suas habilidades.
    * Vença a batalha zerando o HP do seu oponente!

---

## 👨‍🏫 Os Professores 👨‍🏫

Conheça os mestres do Inatel que estão prontos para o combate!

| Professor | HP | Habilidades Especiais |
| :--- | :-: | :--- |
| **Chris** | 120 | `Careca que Tudo Reflete` |
| **Renan** | 95 | `Integral Verdadeira` |
| **Luis Felipe** | 90 | `A Morte da Galinha` |
| **Renzo** | 100 | `O Pulo do Gato` e `Ataque Discreto` |

---

## 💥 Habilidades 💥

Cada professor possui um arsenal de habilidades únicas. Conheça todas elas:

### Habilidades de Ataque

| Habilidade | Dano | Precisão | PP | Descrição |
| :--- | :-: | :---: | :-: | :--- |
| **Soco** | 35 | 100% | 30 | Um soco básico, mas confiável. |
| **Rasteira** | 60 | 70% | 20 | Um ataque de dano moderado com precisão razoável. |
| **Arremesso de Café** | 40 | 90% | 15 | Joga café quente no oponente. |
| **Ataque de Algoritmo** | 20 | 100% | 15 | Causa dano e diminui a evasão do oponente. |
| **Ataque Discreto** | 110 | 70% | 15 | Um ataque poderoso, porém com baixa precisão. |
| **A Morte da Galinha**| 160 | 40% | 5 | Um ataque devastador, mas com uma precisão muito baixa. |
| **Integral Verdadeira**| 80 | 95% | 5 | Um ataque poderoso com 50% de chance de atordoar. |

### Habilidades de Efeito

| Habilidade | Efeito | PP | Descrição |
| :--- | :---: | :-: | :--- |
| **Distração** | -10% Acerto (Alvo) | 20 | Distrai o oponente, diminuindo seu acerto. |
| **Intensivão** | +25% Ataque (Usuário) | 10 | Aumenta o dano dos ataques do usuário em 25%. |
| **O Pulo do Gato** | +50% Ataque (Usuário) | 10 | Aumenta o dano dos ataques do usuário em 50%. |
| **Careca que Tudo Reflete** | +20% Evasão (Usuário) <br> -15% Acerto (Alvo) | 10 | Aumenta a evasão e diminui o acerto do alvo. |

---

## 🚀 Como Executar o Projeto

Para compilar e executar o projeto, você precisa ter o **Java JDK** instalado. Siga os passos abaixo no seu terminal:

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/joaumpdr/inatel-showdown.git](https://github.com/joaumpdr/inatel-showdown.git)
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd inatel-showdown
    ```
3.  **Compile os arquivos Java:**
    ```bash
    javac -d out src/com/inatelshowdown/model/*/*.java src/com/inatelshowdown/model/*.java src/com/inatelshowdown/battle/*.java src/*.java
    ```
4.  **Execute o jogo:**
    ```bash
    java -cp out Main
    ```

---
<div align="center">

Feito por **joaumpdr**

</div>
