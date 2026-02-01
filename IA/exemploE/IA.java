package Estudando_2026.IA.exemploE;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class IA {

    private String nome;
    private boolean ativa = true;

    // Memória
    private List<String> memoriaCurta;
    private Map<String, String> memoriaLonga; // conhecimento aprendido

    // Regras
    private List<Regra> regras;

    // Log
    private List<String> logExecucao;

    public IA(String nome) {
        this.nome = nome;
        this.memoriaCurta = new ArrayList<>();
        this.memoriaLonga = new HashMap<>();
        this.regras = new ArrayList<>();
        this.logExecucao = new ArrayList<>();

        inicializarRegras();
        log("IA inicializada");
    }

    /* =========================
       CICLO PRINCIPAL
       ========================= */

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        log("IA iniciada");

        System.out.println("IA pronta. Digite 'ensinar' para ensinar ou 'sair' para encerrar.");

        while (ativa) {
            System.out.print("\nEntrada > ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                encerrar();
                break;
            }

            if (entrada.equalsIgnoreCase("ensinar")) {
                modoEnsino(scanner);
                continue;
            }

            perceber(entrada);
            String decisao = decidir(entrada);
            agir(decisao);
        }
    }

    private void encerrar() {
        ativa = false;
        log("IA encerrada");
        System.out.println("IA desligada.");
    }

    /* =========================
       MODO DE ENSINO
       ========================= */

    private void modoEnsino(Scanner scanner) {
        System.out.print("Qual é a entrada que deseja ensinar? > ");
        String entrada = scanner.nextLine();

        System.out.print("Qual deve ser a resposta da IA? > ");
        String resposta = scanner.nextLine();

        memoriaLonga.put(normalizar(entrada), resposta);
        log("Novo conhecimento ensinado: " + entrada);

        System.out.println("✔ Aprendido com sucesso!");
    }

    /* =========================
       PERCEPÇÃO
       ========================= */

    private void perceber(String entrada) {
        memoriaCurta.add(entrada);
        log("Percepção: " + entrada);
    }

    /* =========================
       DECISÃO
       ========================= */

    private String decidir(String entrada) {
        String chave = normalizar(entrada);

        // 1️⃣ Prioridade: conhecimento ensinado
        if (memoriaLonga.containsKey(chave)) {
            log("Conhecimento aprendido utilizado");
            return memoriaLonga.get(chave);
        }

        // 2️⃣ Regras fixas
        for (Regra regra : regras) {
            if (regra.aplica(entrada)) {
                log("Regra aplicada: " + regra.nome);
                return regra.executar(entrada);
            }
        }

        // 3️⃣ Fallback
        return "Ainda não sei responder isso. Você pode me ensinar digitando 'ensinar'.";
    }

    /* =========================
       AÇÃO
       ========================= */

    private void agir(String resposta) {
        System.out.println("IA > " + resposta);
        log("Resposta: " + resposta);
    }

    /* =========================
       REGRAS INICIAIS
       ========================= */

    private void inicializarRegras() {

        regras.add(new Regra(
                "Saudação",
                e -> e.toLowerCase().contains("oi") || e.toLowerCase().contains("olá"),
                e -> "Olá! 😄"
        ));

        regras.add(new Regra(
                "Nome",
                e -> e.toLowerCase().contains("seu nome"),
                e -> "Meu nome é " + nome
        ));
    }

    /* =========================
       UTILITÁRIOS
       ========================= */

    private String normalizar(String texto) {
        return texto.trim().toLowerCase();
    }

    private void log(String evento) {
        logExecucao.add(LocalDateTime.now() + " - " + evento);
    }

    /* =========================
       CLASSES INTERNAS
       ========================= */

    private static class Regra {
        String nome;
        Condicao condicao;
        Acao acao;

        Regra(String nome, Condicao condicao, Acao acao) {
            this.nome = nome;
            this.condicao = condicao;
            this.acao = acao;
        }

        boolean aplica(String entrada) {
            return condicao.testar(entrada);
        }

        String executar(String entrada) {
            return acao.executar(entrada);
        }
    }

    @FunctionalInterface
    private interface Condicao {
        boolean testar(String entrada);
    }

    @FunctionalInterface
    private interface Acao {
        String executar(String entrada);
    }

    /* =========================
       MAIN
       ========================= */

    public static void main(String[] args) {
        IA ia = new IA("AthenAI");
        ia.iniciar();
    }
}
