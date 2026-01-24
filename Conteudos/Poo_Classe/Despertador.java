public class Despertador {

    int horas = 12;
    int minutos = 7;
    int soneca = 10;




    void ativarSoneca() {
        System.out.printf("Só mais %d minutinhos :P\n", soneca);
    }

     String agendarAlarme() {
        return "Seu alarme foi configurado ás " + horas + ":" + minutos;

     }


}