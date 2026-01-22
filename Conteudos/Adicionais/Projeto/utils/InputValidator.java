package Projeto.utils;

public class InputValidator {
    
    public static boolean validarNome(String nome) {
        return nome != null && !nome.trim().isEmpty();
    }

    public static boolean validarIdade(int idade) {
        return idade >= 0 && idade <= 150;
    }

    public static boolean validarSalario(double salario) {
        return salario >= 0;
    }

    public static boolean validarOpcaoMenu(int opcao) {
        return opcao >= 1 && opcao <= 4;
    }
}
