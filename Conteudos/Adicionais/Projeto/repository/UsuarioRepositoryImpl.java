package Projeto.repository;

import Projeto.model.Usuario;

public class UsuarioRepositoryImpl implements IUsuarioRepository {
    private Usuario usuario;

    @Override
    public void salvar(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public Usuario buscar() {
        return usuario;
    }

    @Override
    public boolean existe() {
        return usuario != null;
    }
}
