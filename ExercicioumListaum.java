import java.util.Scanner;

public class ExercicioumListaum {

    public static void main(String[] args) {
    
    
     
        double primeiroNumero, segundoNumero, media;
    
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Algoritimo de media aritimetica:");
         

        System.out.println("Informe um Numero positivo");
        primeiroNumero = scanner.nextDouble();

        System.out.println("Informe outro Numero positivo");
        segundoNumero = scanner.nextDouble();


        media = (primeiroNumero + segundoNumero) / 2;


        System.out.println("Media Aritimetica é" + media);


    
    
    
       scanner.close();
    
    
    
    }






}  