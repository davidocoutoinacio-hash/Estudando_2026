package Estudando_2026.IA.exemploE;



import java.util.*;
import java.time.LocalDateTime;


public class IA {

    /* =========================
       1. ESTADO DA IA
       ========================= */

    private String nome;
    private boolean ativa = true;

    // Memória
    private List<String> memoriaCurta;
    private Map<String, String> memoriaLonga;

    // Regras
    private List<Regra> regras;

    // Histórico
    private List<String> logExecucao;

    /* =========================
       2. CONSTRUTOR
       ========================= */

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
       3. CICLO DE VIDA
       ========================= */

    public void iniciar() {
        log("IA iniciada");

        Scanner scanner = new Scanner(System.in);

        while (ativa) {
            System.out.print("\nEntrada > ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                encerrar();
                break;
            }

            perceber(entrada);
            String decisao = decidir();
            agir(decisao);
            aprender(entrada, decisao);
        }
    }

    private void encerrar() {
        ativa = false;
        log("IA encerrada");
        System.out.println("IA desligada.");
    }

    /* =========================
       4. PERCEPÇÃO
       ========================= */

    private void perceber(String entrada) {
        memoriaCurta.add(entrada);
        log("Percepção registrada: " + entrada);
    }

    /* =========================
       5. DECISÃO
       ========================= */

    private String decidir() {
        String ultimaEntrada = memoriaCurta.get(memoriaCurta.size() - 1);

        for (Regra regra : regras) {
            if (regra.aplica(ultimaEntrada)) {
                log("Regra aplicada: " + regra.nome);
                return regra.executar(ultimaEntrada);
            }
        }

        return "Não sei como responder a isso ainda.";
    }

    /* =========================
       6. AÇÃO
       ========================= */

    private void agir(String resposta) {
        System.out.println("IA > " + resposta);
        log("Resposta emitida: " + resposta);
    }

    /* =========================
       7. APRENDIZADO
       ========================= */

    private void aprender(String entrada, String resposta) {
        memoriaLonga.put(entrada, resposta);
        log("Aprendizado armazenado");
    }

    /* =========================
       8. REGRAS
       ========================= */

    private void inicializarRegras() {

        regras.add(new Regra(
                "Saudação",
                entrada -> entrada.toLowerCase().contains("oi") || entrada.toLowerCase().contains("olá"),
                entrada -> "Olá! Como posso ajudar?"
        ));

        regras.add(new Regra(
                "Pergunta Nome",
                entrada -> entrada.toLowerCase().contains("seu nome"),
                entrada -> "Meu nome é " + nome
        ));

        regras.add(new Regra(
                "Memória Longa",
                entrada -> memoriaLonga.containsKey(entrada),
                entrada -> "Você já disse isso antes. Minha resposta foi: " + memoriaLonga.get(entrada)
        ));
    }

    /* =========================
       9. LOG
       ========================= */

    private void log(String evento) {
        logExecucao.add(LocalDateTime.now() + " - " + evento);
    }

    /* =========================
       10. CLASSES INTERNAS
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
       11. MAIN
       ========================= */

    public static void main(String[] args) {
        IA ia = new IA("AthenAI");
        ia.iniciar();
    }
}
