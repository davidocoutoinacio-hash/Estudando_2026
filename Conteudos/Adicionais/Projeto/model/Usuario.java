package Projeto.model;

public class Usuario {
    private String nome;
    private int idade;
    private double salarioMensal;

    public Usuario() {
    }

    public Usuario(String nome, int idade, double salarioMensal) {
        this.nome = nome;
        this.idade = idade;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double calcularSalarioAnual() {
        return salarioMensal * 12;
    }

    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s%nIdade: %d%nSalário mensal: R$ %.2f", 
                           nome, idade, salarioMensal);
    }
}
