package Projeto.repository;

import Projeto.model.Usuario;

public interface IUsuarioRepository {
    void salvar(Usuario usuario);
    Usuario buscar();
    boolean existe();
}
