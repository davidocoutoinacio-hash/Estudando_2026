public class MiniIA {
    public static void main(String[] args) {
        // Dados de treino (Porta Lógica AND)
        // {Entrada1, Entrada2, Resultado Esperado}
        double[][] dadosTreino = {
            {0, 0, 0},
            {0, 1, 0},
            {1, 0, 0},
            {1, 1, 1}
        };

        double[] pesos = {Math.random(), Math.random()};
        double bias = Math.random();
        double taxaAprendizado = 0.1;
        int epocas = 1000;

        // Treinamento
        for (int i = 0; i < epocas; i++) {
            for (double[] exemplo : dadosTreino) {
                double entrada1 = exemplo[0];
                double entrada2 = exemplo[1];
                double esperado = exemplo[2];

                // Calculando a saída (Soma ponderada)
                double soma = (entrada1 * pesos[0]) + (entrada2 * pesos[1]) + bias;
                double predicao = (soma > 0.5) ? 1 : 0; // Função de ativação simples (Step)

                // Ajuste de pesos (Backpropagation simplificado)
                double erro = esperado - predicao;
                pesos[0] += erro * entrada1 * taxaAprendizado;
                pesos[1] += erro * entrada2 * taxaAprendizado;
                bias += erro * taxaAprendizado;
            }
        }

        // Testando a IA
        System.out.println("Resultado para [1, 1]: " + prever(1, 1, pesos, bias));
        System.out.println("Resultado para [1, 0]: " + prever(1, 0, pesos, bias));
    }

    public static int prever(double e1, double e2, double[] pesos, double bias) {
        double soma = (e1 * pesos[0]) + (e2 * pesos[1]) + bias;
        return (soma > 0.5) ? 1 : 0;
    }
}