/* Campos dos goytacazes, RJ-Brasil.
 * Aluno: Marcus Vinícius Passos dos Santos
 * Data: 23/11/2022
 * Não comentei o código devido o mesmo já estar com o nome nas variáveis bem descritivas.
 * Acrescentei a porcentagem para as mulheres no código por achar mais justo.
 */
import java.util.Locale;
import java.util.Scanner;

public class DesafioAtletas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner dado = new Scanner(System.in);
        String nome, sexo;
        String aux = null;
        double homem = 0;
        double mulher = 0;
        double altura;
        double peso = 0;
        double acumulador = 0;
        double mediaPeso = 0;
        double atletaMaisAlto = 1.0;
        double mediaMulher = 0.0;
        double auxF = 0.0;


        System.out.print("Qual a quantidade de atletas?  ");
        int quantidadeAtletas = dado.nextInt();

        for (int i = 1; i <= quantidadeAtletas; i++) {
            
            System.out.printf("Digite os dados do %d º atleta: ", i);
            dado.nextLine();
            nome = dado.nextLine();
        

            System.out.print("Sexo: ");
            sexo = dado.next();
            if ((!sexo.equalsIgnoreCase("F")) && (!sexo.equalsIgnoreCase("M"))) {
                System.out.print("Valor inválido! Favor digitar F ou M: ");
                sexo = dado.next();
            }

            if (sexo.equalsIgnoreCase("M")){
                homem = homem + 1;
            } 
            if (sexo.equalsIgnoreCase("F")){
                mulher = mulher + 1;
            } 

            System.out.print("Altura: ");
            altura = dado.nextDouble();
            while (altura <= 0) {
                System.out.print("Valor inválido! favor digitar um valor positivo: ");
                altura = dado.nextDouble();
            }

            if (altura > atletaMaisAlto){
                atletaMaisAlto = altura;
                aux = nome;
            }else if(altura < atletaMaisAlto){
                nome = aux;
            }

            if (sexo.equalsIgnoreCase("F")){
                auxF = auxF + 1;
                mediaMulher = mediaMulher + altura;
            }

        

            System.out.print("Peso: ");
            peso = dado.nextDouble();
            while (peso <= 0) {
                System.out.print("Valor inválido! favor digitar um valor positivo: ");
                peso = dado.nextDouble();

            }
            acumulador = acumulador + peso;
            
            
        }
         
    
        mediaPeso = acumulador / quantidadeAtletas;

        double porcentagemHomem = (homem * 100) / quantidadeAtletas;
        double porcentagemMulher = (mulher * 100) / quantidadeAtletas;



        System.out.println();
        System.out.println("RELATÓRIO: ");
        System.out.printf("Peso médio dos atletas: %.2f%n", mediaPeso);
        System.out.printf("Atleta mais alto: %s%n " ,aux);
        System.out.printf("Porcentagem de homens: %.1f %%%n ",porcentagemHomem);
        System.out.printf("Porcentagem de mulheres: %.1f %%%n ",porcentagemMulher);
        
        if (mediaMulher != 0) {
            mediaMulher = mediaMulher / auxF;
            System.out.printf("Altura média das mulheres: %.2f%n ",mediaMulher);
        }else 
            System.out.println("Não há mulheres cadastradas.");

        dado.close();
    }
}
