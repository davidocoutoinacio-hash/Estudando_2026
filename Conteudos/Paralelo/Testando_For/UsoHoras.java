package Estudando_2026.Conteudos.Paralelo.Testando_For;
            
        import java.time.LocalTime;

            public class UsoHoras {
                public static void main(String[] args) {


                    for (int i = 1; i < 99; i++) {
                        for (int j = 100; j < 199; j++) {
                            for (int k = 200; k < 299; k++) {


                        try {
                                Thread.sleep(1000);
                               System.out.println("Hora número: " + i);
                                Thread.sleep(1000);
                                System.out.println("Minuto número: " + j);
                                Thread.sleep(1000);
                                System.out.println("Segundo número: " + k);



                        } catch (Exception e) {

                        }

                    }


                        }

                    }

                    }
                }  
            