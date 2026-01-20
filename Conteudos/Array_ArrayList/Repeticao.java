package Estudando_2026.Conteudos.Array_ArrayList;

public class Repeticao {

    public static void main(String[] args) {

        try {
            while (true) {

                int x = 1;
                int y = 150;
                int z = 0;

                for (int i = 0; i < 10; i++) {
                    z = x + y;
                    System.out.println(z);
                    x = y;
                    y = z;

                    switch (z) {
                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("Um");
                            break;
                        default:
                            System.out.println("Outro número");
                            break;
                    }
                }
                
                break;
            }

        } catch (ArithmeticException e) {
            System.out.println("Erro aritmético: " + e.getMessage());
        }
    }
}