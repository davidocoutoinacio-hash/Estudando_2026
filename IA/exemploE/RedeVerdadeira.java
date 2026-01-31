package Estudando_2026.IA.exemploE;

public class RedeVerdadeira {
    // Função de ativação Sigmoide
    public static double sigmoide(double x) { return 1 / (1 + Math.exp(-x)); }
    // Derivada da sigmoide para o ajuste (gradiente)
    public static double derivadaSigmoide(double x) { return x * (1 - x); }

    public static void main(String[] args) {
        // Dados XOR: 0^0=0, 0^1=1, 1^0=1, 1^1=0
        double[][] entradas = {{0,0}, {0,1}, {1,0}, {1,1}};
        double[][] saidasEsperadas = {{0}, {1}, {1}, {0}};

        // Pesos Aleatórios
        double[][] pesosH = {{Math.random(), Math.random()}, {Math.random(), Math.random()}}; // 2x2
        double[] pesosO = {Math.random(), Math.random()}; // 2x1
        
        double taxaAprendizado = 0.5;

        for (int epoca = 0; epoca < 20000; epoca++) {
            for (int i = 0; i < entradas.length; i++) {
                // 1. FORWARD PROPAGATION
                // Camada Oculta
                double h1 = sigmoide(entradas[i][0] * pesosH[0][0] + entradas[i][1] * pesosH[0][1]);
                double h2 = sigmoide(entradas[i][0] * pesosH[1][0] + entradas[i][1] * pesosH[1][1]);

                // Saída
                double predicao = sigmoide(h1 * pesosO[0] + h2 * pesosO[1]);

                // 2. BACKPROPAGATION (O "Cérebro" ajustando o erro)
                double erroSaida = saidasEsperadas[i][0] - predicao;
                double gradienteSaida = erroSaida * derivadaSigmoide(predicao);

                // Erro nas camadas ocultas
                double erroH1 = gradienteSaida * pesosO[0];
                double erroH2 = gradienteSaida * pesosO[1];

                // Ajuste pesos Saída
                pesosO[0] += gradienteSaida * h1 * taxaAprendizado;
                pesosO[1] += gradienteSaida * h2 * taxaAprendizado;

                // Ajuste pesos Ocultos
                pesosH[0][0] += erroH1 * derivadaSigmoide(h1) * entradas[i][0] * taxaAprendizado;
                pesosH[0][1] += erroH1 * derivadaSigmoide(h1) * entradas[i][1] * taxaAprendizado;
                pesosH[1][0] += erroH2 * derivadaSigmoide(h2) * entradas[i][0] * taxaAprendizado;
                pesosH[1][1] += erroH2 * derivadaSigmoide(h2) * entradas[i][1] * taxaAprendizado;
            }
        }

        // Teste Final
        System.out.println("Resultados após o treino:");
        testar(0, 1, pesosH, pesosO);
        testar(1, 1, pesosH, pesosO);
    }

    static void testar(double e1, double e2, double[][] ph, double[] po) {
        double h1 = sigmoide(e1 * ph[0][0] + e2 * ph[0][1]);
        double h2 = sigmoide(e1 * ph[1][0] + e2 * ph[1][1]);
        double res = sigmoide(h1 * po[0] + h2 * po[1]);
        System.out.printf("Entrada: [%.0f, %.0f] -> Saída: %.4f (Próximo de %d)\n", e1, e2, res, Math.round(res));
    }
}