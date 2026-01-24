public class Metodos {

    public static void main(String[] args) {
        // ativarSoneca();
        Despertador meuDespertador = new Despertador();
        meuDespertador.ativarSoneca();
        meuDespertador.horas = 6;
        meuDespertador.minutos = 30;
        System.out.println(meuDespertador.agendarAlarme()); 


    }

}

