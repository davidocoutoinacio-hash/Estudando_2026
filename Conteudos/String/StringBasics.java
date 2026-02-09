public class StringBasics {

    public static void main(String[] args){

    //String srt = new String("Java s2");
    //String srt0 = new String("Java s2");

        //false
        //System.out.println(srt == srt0);

       
        //String str1 = "Java s2";
        //String str2 = "Java s2";

        //true
        //System.out.println(str1 == str2);

        //Caracteres especiais
        //System.out.println("\nJava\ts2");

        //String é um array de chars
        String nome = "Jonas For";
        //System.out.println("Primeira letra do nome: " + nome.charAt(0));

        //Posição de caractere
        System.out.println("Posição da letra J no nome: " + nome.indexOf("J"));

        //Sobrenome da pessoa
        int posicaoSobrenome = nome.indexOf(" ") + 1;
        //System.out.println("Sobrenome: " + nome.substring(posicaoSobrenome, posicaoSobrenome + 1));


        //Caracteres do nome
        //System.out.println("Número de caracteres no nome: " + (nome.length() - 1));

        //Substituição de caracteres
        //System.out.println(nome.replaceAll("[JjonF]", "*"));

        //Concatenação
        String primeiroNome = "Jonas";
        String sobrenome = "For";
        System.out.println(primeiroNome + " " + sobrenome); 
    

    }


}