import java.util.Scanner;


public class ExerciciocincoListaum {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        double horas, salariohr, salariofamilia, numerodefilhos;
        System.out.println("Digite o número de horas trabalhadas no mês: ");
        horas = scanner.nextDouble();

        System.out.println("Digite o valor recebido por hora de trabalho: R$");
        salariohr= scanner.nextDouble();

        System.out.println("Digite o valor do salário família: R$");
        salariofamilia = scanner.nextDouble();

        System.out.println("Digite o número de filhos com idade menor que 14 anos: ");
        numerodefilhos = scanner.nextDouble();

        double salario  = horas * salariohr;
        salario += salariofamilia * numerodefilhos;

        System.out.printf("O salário bruto a ser recebido é: R$%.2f", salario);

        scanner.close();

    }
        
}
