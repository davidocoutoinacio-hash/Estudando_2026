package Projeto.service;

import Projeto.model.Usuario;

public interface IUsuarioService {
    void cadastrarUsuario(String nome, int idade, double salarioMensal);
    Usuario obterUsuario();
    double calcularSalarioAnual();
    boolean verificarMaioridade();
}
