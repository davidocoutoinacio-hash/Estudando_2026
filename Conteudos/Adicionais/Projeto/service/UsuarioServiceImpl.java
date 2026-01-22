package Projeto.service;

import Projeto.model.Usuario;
import Projeto.repository.IUsuarioRepository;

public class UsuarioServiceImpl implements IUsuarioService {
    private final IUsuarioRepository repository;

    public UsuarioServiceImpl(IUsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public void cadastrarUsuario(String nome, int idade, double salarioMensal) {
        Usuario usuario = new Usuario(nome, idade, salarioMensal);
        repository.salvar(usuario);
    }

    @Override
    public Usuario obterUsuario() {
        return repository.buscar();
    }

    @Override
    public double calcularSalarioAnual() {
        Usuario usuario = repository.buscar();
        return usuario != null ? usuario.calcularSalarioAnual() : 0;
    }

    @Override
    public boolean verificarMaioridade() {
        Usuario usuario = repository.buscar();
        return usuario != null && usuario.isMaiorDeIdade();
    }
}
