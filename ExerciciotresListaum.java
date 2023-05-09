import java.util.Scanner;



public class ExerciciotresListaum {


    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    double temperatura, resultado;


    
    System.out.println("Informe a temperatura em  Fahrenheit");
    temperatura= scanner.nextDouble();
    
    resultado = (temperatura - 32) / 1.8;


    System.out.println("A temperatura em grus Centigrados é" + resultado);
    
    
    
    
    
    
    
    
    
    scanner.close();
    }
    
}
