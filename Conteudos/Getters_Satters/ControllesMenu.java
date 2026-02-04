
import java.util.Scanner;

public class ControllesMenu {

    


    private long cpf;
    private long telefone;
    private String endereco;
    private int idade;

  

    public void setCpf() {
    this.cpf = cpf;

    }
    public void getCpf() {
    System.out.println(cpf);   
    return;
    }
    public void setTelefone() {
    this.telefone = telefone;
    }
    public void getTelefone(){
        System.out.println(telefone);
    return;
    }
    public void setEndereco() {
        this.endereco = endereco;
    }
    public void getEndereço() {
        System.out.println(endereco);
    return;
    }
    public void setIdade() {
      this.idade = idade;
    }
    public void getIdade() {
        System.out.println(idade);
    return;
    }

     public void cadastrarCpf(){

       try {
           
        System.out.println("Cadastre seu CPF:");
        Scanner scanner = new Scanner(System.in);
        cpf = scanner.nextLong();
        System.out.println("CPF cadastrado com sucesso!!");

         } catch (Exception e) {
            System.out.println("Tente novamente!");
       }

        }

       public void cadastrarTelefone(){

        try {

        System.out.println("Cadastre seu numero de Telefone:");
        Scanner scanner1 = new Scanner(System.in);
        telefone = scanner1.nextLong();
        System.out.println("Telefone cadastrado com sucesso!!");
             } catch (Exception e) {
             System.out.println("Tente novamente!");
     
            }

        }

    
       public void cadastrarEnderco(){

       try {

        System.out.println("Cadastre seu Endereço:");

         Scanner scanner2 = new Scanner(System.in);
         endereco = scanner2.nextLine();

        System.out.println("Endereço cadastrado com sucesso!!");
         } catch (Exception e) {
         System.out.println("Tente novamente!");
       }

        }

        public void cadastrarIdade(){

        try {
        System.out.println("Cadastre sua Idade:");
        Scanner scanner3 = new Scanner(System.in);
        idade = scanner3.nextInt();
        System.out.println("Idade cadastrado com sucesso!!");
         } catch (Exception e) {
            System.out.println("Tente novamente!");
       }

     }
    
            
        public void consultarCpf() {
                System.out.println("Seu Cpf é:" + cpf);   

    }

         public void consultarTelefone() {
                System.out.println("Seu Telefone é:" + telefone);
             

         }

        public void consultarEndereco() {
                System.out.println("Seu Enderço é:" + endereco);  

    }
        
        public void consultarIdade() {
                System.out.println("Sua Idade é:" + idade + " anos ");       

    }

        public void sair() {
                System.out.println("Sair");
                System.exit(0);
      

    
        } 

    

           public void consultarDados(){

            Scanner scanner = new Scanner(System.in);

     while(true){
        System.out.println("=================================");
        System.out.println("Consulta");
        System.out.println("=================================");
        System.out.println("1 - Consultar CPF");
        System.out.println("2 - Consultar Telefone");
        System.out.println("3 - Consultar Endereço");
        System.out.println("4 - Consultar Idade");
        System.out.println("5 - Sair");
        System.out.println("=================================");


        while(true){
        switch(scanner.nextInt()) {

        case 1:
        consultarCpf();
        break;

        case 2:
        consultarTelefone();
        break;

        case 3:
        consultarEndereco();
        break;
        
        case 4:
        consultarIdade();
        break;

        case 5:
        MenuCompleto();
        break;
        
        case 6:
        System.exit(0);
        }

    }

}
        

     }
    
        public void cadastrarDados() {


            ControllesMenu controle = new ControllesMenu();
            Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("Cadastrar Dados");
        System.out.println("=================================");
        System.out.println("1 - CPF");
        System.out.println("2 - Telefone");
        System.out.println("3 - Endereço");
        System.out.println("4 - Idade");
        System.out.println("5 - Menu de Dados");
        System.out.println("6 - Sair");
        System.out.println("=================================");

    while(true){
        switch(scanner.nextInt()) {

        case 1:
        controle.cadastrarCpf();
        break;

        case 2:
        controle.cadastrarTelefone();
        break;

        case 3:
        controle.cadastrarEnderco();
        break;
        
        case 4:
        controle.cadastrarIdade();
        break;

        case 5:
        MenuCompleto();
        break;
        
        case 6:
        System.exit(0);
        }

    }

    }


    public void MenuCompleto() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção");
        System.out.println("1 - Cadastrar Dados");
        System.out.println("2 - Consultar Dados");

        while(true){
        switch(scanner.nextInt()) {


        case 1:    
        cadastrarDados();
        break;
        case 2:    
        consultarDados();
        break;



        }





    }


    }


}


    


         
        
    
    

