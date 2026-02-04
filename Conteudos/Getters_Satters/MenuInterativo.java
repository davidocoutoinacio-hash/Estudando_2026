import java.util.Scanner;
public class MenuInterativo {


    public static void main(String[] args){
       
        ControleMenu controle = new ControleMenu();
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o nome do usuario");
        controle.setNome(entrada.nextLine());

        System.out.println("Digite o ID de usuario");
        controle.setId(entrada.nextInt());

        System.out.println("Digite o Cpf de usuario");
        controle.setCpf(entrada.nextLong());

        System.out.println("Digite o Telefone de usuario");
        controle.setTelefone(entrada.nextLong());

        System.out.println("Digite o Endereço de usuario");
        controle.setEndereco(entrada.nextLine());

        System.out.println("==========================================");

        System.out.println("ID:" + controle.getId());
          System.out.println("Nome:" + controle.getNome());
            System.out.println("Cpf:" + controle.getCpf());
               System.out.println("Telefone:" + controle.getTelefone());
                 System.out.println("Endereco:" + controle.getEndereco());
                 entrada.nextInt();



        }

        }
        

    


     


       
