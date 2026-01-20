🧑‍💼 Avaliação Técnica – Aula 2 (Métodos)
✅ ACERTOS IMPORTANTES (parabéns)
✔️ 1. Você ENTENDEU o propósito dos métodos

Isso é o mais importante da aula.

Você separou corretamente:

Entrada de dados → comecar()

Menu → menu()

Exibição → mostrarDados()

Cálculo → calcularSalarioAnual()

Regra lógica → isMaiorDeIdade()

👉 Isso é exatamente o que eu queria ver.

✔️ 2. Métodos pequenos e com responsabilidade única

Exemplo perfeito:

static double calcularSalarioAnual() {
    return salary * 12;
}


✔️ Simples
✔️ Claro
✔️ Reutilizável

👉 Esse é o padrão profissional.

✔️ 3. Uso correto de retorno (return)

Você:

Criou método

Retornou valor

Usou no switch

double salarioAnual = calcularSalarioAnual();


👉 Aqui você cruzou a linha do iniciante absoluto.

✔️ 4. Lógica do menu está correta

while (opcao != 4)

switch

Fluxo previsível

👉 Excelente.

⚠️ AJUSTES NECESSÁRIOS (importantes, mas normais)

Agora vem a parte crítica para evoluir sem criar vícios.

⚠️ 1. Você voltou a criar uma “classe de estado global”
static String name;
static int age;
static double salary;


📌 Problema conceitual:

Você está usando static como se fosse “variável global”

Isso funciona, mas não é boa prática a longo prazo

💡 Por enquanto é aceitável, mas:

Isso NÃO é orientação a objetos
Isso é programação procedural com Java

⚠️ Não é errado agora, mas não pode virar hábito.

⚠️ 2. Dois Scanner diferentes (atenção!)
Scanner scanner = new Scanner(System.in);


Você cria:

Um Scanner em comecar()

Outro em menu()

📌 Problemas:

Ambos usam System.in

Pode causar comportamento estranho em programas maiores

Não fecha nenhum deles

💡 Correção ideal (nível Aula 2.5):

Criar um único Scanner

Passar como parâmetro para os métodos

⚠️ 3. MainCorreto virou apenas um “chamador”
public class MainCorreto {
    public static void main(String[] args) {
        UsoMenuCorreto.comecar();
        UsoMenuCorreto.menu();
    }
}


📌 Isso funciona, mas:

Main perdeu protagonismo

Você criou uma “classe utilitária” sem perceber

💡 Para este estágio, o ideal seria:

Tudo na Main

Métodos abaixo do main

👉 Separar classes vem depois, com orientação a objetos.

⚠️ 4. isMaiorDeIdade poderia ser mais bem usada

Você fez:

boolean maiorDeIdade = isMaiorDeIdade(age);
System.out.println("Maior de idade: " + (maiorDeIdade ? "Sim" : "Não"));


✔️ Funciona
✔️ Boa lógica

💡 Pequena melhoria de legibilidade:

System.out.println(isMaiorDeIdade(age) ? 
    "\nVocê é maior de idade." : 
    "\nVocê é menor de idade.");

🧠 Avaliação Final – Aula 2
📊 Nota: 8 / 10
Critério	Avaliação
Entendimento de métodos	✅ Muito bom
Organização do código	✅ Boa
Uso de return	✅ Correto
Uso de static	⚠️ Em transição
Estrutura geral	⚠️ Pode simplificar

💬 Feedback sincero:

Você entendeu a aula. Agora o foco é simplificar, não estruturar demais cedo.