public class ModificadorStatic {
        

    public static void main(String[] args) {
        Conta contaMaria = new Conta();  
        Conta contaJoao = new Conta();  
       

        contaMaria.depositarContaConjunta(1000);
        contaMaria.depositarConta(0);
        contaJoao.depositarConta(100);

    

        System.out.println(Conta.saldoContaConjunta);
        System.out.println(contaJoao.saldo);
        System.out.println(contaMaria.saldo);
       





    }

    
}
