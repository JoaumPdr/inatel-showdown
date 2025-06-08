import com.inatelshowdown.battle.Batalha;
import com.inatelshowdown.model.Professor;
import com.inatelshowdown.model.Habilidade;
import com.inatelshowdown.model.habilidades.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            // --- Criando o Pool de Habilidades Comuns ---
            Habilidade soco = new Soco();
            Habilidade rasteira = new Rasteira();
            Habilidade distracao = new Distracao();
            Habilidade arremessoCafe = new ArremessoDeCafe();
            Habilidade ataqueAlgoritmo = new AtaqueDeAlgoritmo();
            Habilidade intensivao = new Intensivao();

            // --- Criando Professores e suas Habilidades Especiais ---

            // Professor 1: Chris
            List<Habilidade> habilidadesChris = new ArrayList<>();
            habilidadesChris.add(new CarecaQueTudoReflete()); // Especial
            habilidadesChris.add(soco);
            habilidadesChris.add(distracao);
            Professor chris = new Professor("Chris", 120, habilidadesChris);

            // Professor 2: Renan
            List<Habilidade> habilidadesRenan = new ArrayList<>();
            habilidadesRenan.add(new IntegralVerdadeira()); // Especial
            habilidadesRenan.add(ataqueAlgoritmo);
            habilidadesRenan.add(soco);
            Professor renan = new Professor("Renan", 95, habilidadesRenan);

            // Professor 3: Luis Felipe
            List<Habilidade> habilidadesFelipe = new ArrayList<>();
            habilidadesFelipe.add(new MorteDaGalinha()); // Especial
            habilidadesFelipe.add(rasteira);
            habilidadesFelipe.add(arremessoCafe);
            Professor felipe = new Professor("Luis Felipe", 90, habilidadesFelipe);

            // Professor 4: Renzo
            List<Habilidade> habilidadesRenzo = new ArrayList<>();
            habilidadesRenzo.add(new PuloDoGato()); // Especial
            habilidadesRenzo.add(new AtaqueDiscreto()); // Outra especial
            habilidadesRenzo.add(intensivao);
            Professor renzo = new Professor("Renzo", 100, habilidadesRenzo);

            System.out.println("Bem-vindo ao Inatel Showdown!");
            System.out.println("Escolha o seu lutador:");
            System.out.println("1 - Chris");
            System.out.println("2 - Renzo");

            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();

            Professor jogador;
            Professor inimigo;

            if (escolha == 1) {
                jogador = chris;
                inimigo = renzo;
            } else {
                jogador = renzo;
                inimigo = chris;
            }

            // --- Iniciando a Batalha ---
            Batalha batalha = new Batalha(jogador, inimigo);
            batalha.iniciar();

            scanner.close();
        }
    }