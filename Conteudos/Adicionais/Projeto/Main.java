package Projeto;

import Projeto.config.AppConfig;
import Projeto.controller.MenuController;

public class Main {
    
    public static void main(String[] args) {
        MenuController controller = AppConfig.configurarAplicacao();
        controller.iniciar();
    }
}
