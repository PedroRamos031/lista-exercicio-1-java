import java.util.Scanner;

public class ExercicioquatroListaum {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        double capitalinicial, prazo, taxa, capitalfinal;

        System.out.println("Digite o capital inicial");
        capitalinicial = scanner.nextDouble();

        System.out.println("Digite o prazo");
        prazo = scanner.nextDouble();

         System.out.println("Digite a taxa anual");
        taxa = scanner.nextDouble();

        taxa = taxa/100;
    
        capitalfinal = capitalinicial * Math.pow((1 + taxa),prazo);
    
        System.out.printf("Seu Capital Final é: " + capitalfinal);
    
    
        
    
    
    
    
    
    scanner.close();
    
    
    }
}
