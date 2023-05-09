import java.util.Scanner;

public class ExercicioseisListaum {
    
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Escreva um numero :");
        double numeroum = scanner.nextDouble();

        System.out.println("Digite o segundo numero : ");
        double numerodois = scanner.nextDouble();
    
        double resultado = Math.pow(numeroum, numerodois);

        System.out.printf("O logaritmo de %.2f na base %.2f é: %.2f", numeroum, numerodois, resultado);
       
       
       
       
       
       
        scanner.close();


        }
}
