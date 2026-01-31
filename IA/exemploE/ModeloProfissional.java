package Estudando_2026.IA.exemploE;



import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
import org.deeplearning4j.nn.conf.layers.DenseLayer;
import org.deeplearning4j.nn.conf.layers.OutputLayer;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.deeplearning4j.nn.weights.WeightInit;
import org.nd4j.linalg.activations.Activation;
import org.nd4j.linalg.learning.config.Adam;
import org.nd4j.linalg.lossfunctions.LossFunctions;

public class ModeloProfissional {
    public static void main(String[] args) {
        // Configuração da Arquitetura
        MultiLayerConfiguration conf = new NeuralNetConfiguration.Builder()
            .seed(123) // Reprodutibilidade
            .updater(new Adam(0.01)) // Otimizador inteligente
            .list()
            .layer(0, new DenseLayer.Builder()
                .nIn(2) // 2 Entradas
                .nOut(10) // 10 Neurônios na camada oculta
                .activation(Activation.RELU) // Ativação moderna
                .weightInit(WeightInit.XAVIER)
                .build())
            .layer(1, new OutputLayer.Builder(LossFunctions.LossFunction.MSE)
                .nIn(10)
                .nOut(1) // 1 Saída
                .activation(Activation.SIGMOID)
                .build())
            .build();

        // Inicialização do modelo
        MultiLayerNetwork model = new MultiLayerNetwork(conf);
        model.init();

        System.out.println("Modelo de IA pronto para o treinamento!");
        System.out.println(model.summary());
    }
}