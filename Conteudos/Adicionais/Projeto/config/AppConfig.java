package Projeto.config;

import Projeto.controller.MenuController;
import Projeto.repository.IUsuarioRepository;
import Projeto.repository.UsuarioRepositoryImpl;
import Projeto.service.IUsuarioService;
import Projeto.service.UsuarioServiceImpl;
import Projeto.view.MenuView;

public class AppConfig {
    
    public static MenuController configurarAplicacao() {
        IUsuarioRepository repository = new UsuarioRepositoryImpl();
        IUsuarioService service = new UsuarioServiceImpl(repository);
        MenuView view = new MenuView();
        
        return new MenuController(service, view);
    }
}
