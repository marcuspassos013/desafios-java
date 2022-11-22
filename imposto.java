import java.util.Locale;
import java.util.Scanner;

public class imposto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        double salario, prestaSevico, ganhoCapital,
                gastoMedico, gastoEducacional;
        double impostoBrutoTotal = 0; 
        double maximoDedutivo = 0;  
        double gastoDedutivo = 0; 
        double abatimento = 0; 
        double impostoDevido = 0;   
        double imposto = 0;

//Dados de entrada.        
        System.out.print("Renda anual com salário de: ");
        salario = input.nextDouble();

        System.out.print("Renda anual com serviços prestados: ");
        prestaSevico = input.nextDouble();

        System.out.print("Renda anual com ganho de capital: ");
        ganhoCapital = input.nextDouble();

        System.out.print("Gastos médicos: ");
        gastoMedico = input.nextDouble();

        System.out.print("Gastos educacionais:");
        gastoEducacional = input.nextDouble();

        System.out.println();
        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA:");
        System.out.println();
        System.out.println("CONSOLIDADO DE RENDA:");


//lógica para calcular imposto sobre o salário.        
        if (x / 12 <= 3000) {
            imposto = salario - salario;
            System.out.printf("Imposto sobre salário %.2f%n", imposto);
        } else if ((salario / 12 > 3000) && (salario / 12 <= 5000)) {
            imposto = salario - (salario * (1 - 0.10));
            System.out.printf("Imposto sobre salário %.2f%n", imposto);
        } else if (salario / 12 > 5000) {
            imposto = salario - (salario * (1 - 0.20));

            System.out.printf("Imposto sobre salário %.2f%n", imposto);

        } else
            System.out.println();

//lógica para calcular imposto sobre prestação de serviço
        if (prestaSevico > 0) {
            prestaSevico = (double) prestaSevico - (prestaSevico * (1 - 0.15));
            System.out.printf("Imposto sobre serviços: %.2f%n ", prestaSevico);
        } else
            prestaSevico = 0.00;
            System.out.printf("Imposto sobre serviços: %.2f%n ", prestaSevico);


//lógica para calcular imposto sobre ganhos capitais.(imóveis,ações,venda de automóveis,etc..)
        if (ganhoCapital > 0){
            ganhoCapital = (double) ganhoCapital - (ganhoCapital * (1 - 0.20));
            System.out.printf("Imposto sobre ganho capital: %.2f%n ",ganhoCapital);
        } else
            System.out.println();



            System.out.println();
            System.out.println("DEDUÇÕES:");
            
            impostoBrutoTotal = imposto + prestaSevico + ganhoCapital;

            maximoDedutivo = impostoBrutoTotal -(impostoBrutoTotal * (1 - 0.30));

            gastoDedutivo = gastoMedico + gastoEducacional;

            System.out.printf("Máximo dedutível %.2f%n: ",maximoDedutivo);
            System.out.printf("Gastos dedutíveis %.2f%n: ",gastoDedutivo);

            System.out.println();

            System.out.println("RESUMO:");
            System.out.printf("Imposto bruto total %.2f%n: ",impostoBrutoTotal);

// lógica para calcular o imposto total.
        if(gastoDedutivo > impostoBrutoTotal){
            abatimento = maximoDedutivo;
        }  else 
            abatimento = gastoDedutivo;
           
            System.out.println();

           impostoDevido = impostoBrutoTotal - abatimento;

           System.out.printf("Abatimento: %.2f%n ",abatimento);
           System.out.printf("Imposto devido: %.2f%n ",impostoDevido);
           
        input.close();
    }
}
