import java.util.Scanner;




public class ExerciciodoisListaum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        


        double numeroUm, valor, dez;


        System.out.println("Escreva um numero");
        numeroUm=scanner.nextDouble();

        dez = numeroUm * 10/100;

        valor = numeroUm + dez;

        System.out.println("Valor do resultado é" + valor);





        


        scanner.close();
    }
    
}
