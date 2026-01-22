package Projeto.controller;

import Projeto.service.IUsuarioService;
import Projeto.view.MenuView;
import Projeto.model.Usuario;

public class MenuController {
    private final IUsuarioService usuarioService;
    private final MenuView view;

    public MenuController(IUsuarioService usuarioService, MenuView view) {
        this.usuarioService = usuarioService;
        this.view = view;
    }

    public void iniciar() {
        coletarDadosIniciais();
        executarMenu();
        view.fechar();
    }

    private void coletarDadosIniciais() {
        String nome = view.solicitarNome();
        int idade = view.solicitarIdade();
        double salario = view.solicitarSalario();
        
        usuarioService.cadastrarUsuario(nome, idade, salario);
    }

    private void executarMenu() {
        int opcao = 0;
        
        while (opcao != 4) {
            opcao = view.exibirMenuEObterOpcao();
            processarOpcao(opcao);
        }
    }

    private void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                exibirDadosCadastrados();
                break;
            case 2:
                calcularESalarioAnual();
                break;
            case 3:
                verificarMaioridade();
                break;
            case 4:
                view.exibirMensagemSaida();
                break;
            default:
                view.exibirOpcaoInvalida();
        }
    }

    private void exibirDadosCadastrados() {
        Usuario usuario = usuarioService.obterUsuario();
        view.exibirDadosUsuario(usuario.toString());
    }

    private void calcularESalarioAnual() {
        double salarioAnual = usuarioService.calcularSalarioAnual();
        view.exibirSalarioAnual(salarioAnual);
    }

    private void verificarMaioridade() {
        boolean isMaior = usuarioService.verificarMaioridade();
        view.exibirMensagemMaioridade(isMaior);
    }
}
