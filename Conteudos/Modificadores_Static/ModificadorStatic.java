public class ModificadorStatic {
        

    public static void main(String[] args) {


    // Uso de Static
    // 1. Quando não precisamos de objeto
    // 2. Quando queremos criar constantes, como o valor de pi por exemplo
    // 3. Classes uilitarias que não dependem de objetos

        //    Conta contaMaria = new Conta();  
        //    Conta contaJoao = new Conta();  
        //    Conta.depositarContaConjunta(1000);
        //    contaMaria.depositarConta(0);
        //    contaJoao.depositarConta(100);
        //    double resultadoFinal = Conta.saldoContaConjunta - Conta.TAXA_SERVICO;
        //    System.out.println("Saldo: " + Conta.saldoContaConjunta);
        //    System.out.println("Taxa: " + Conta.TAXA_SERVICO);
        //System.out.println("Resultado final: " + resultadoFinal);
        //  System.out.println(contaJoao.saldo);
        // System.out.println(contaMaria.saldo);

        Conta contaJoao = new Conta();
        contaJoao.depositarConta(1.555);
        System.out.println(contaJoao.saldo);
        System.out.println(Math.round(contaJoao.saldo));
        //Metodo Math é nativo da linguagem java, ele tem varias operações matematicas já instanciadas para o uso 
        // fazendo com que a necessidade de instanciar operações matematicas nos codigos seja menos necessaria 
        // floor no metodo Math serve para arredondar o numero para baixo
        // ceil serve para arredondar para cima
        // round serve para arredondar altomaticamente para o valor mais proximo.

       




    }

    
}
