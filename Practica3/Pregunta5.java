import java.util.Scanner;
public class Pregunta5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lado1 = scan.nextDouble();
        double lado2 = scan.nextDouble();
        double lado3 = scan.nextDouble();
        
        if(Math.pow(lado1, 2) == Math.pow(lado2, 2) + Math.pow(lado3, 2) ||
           Math.pow(lado2, 2) == Math.pow(lado1, 2) + Math.pow(lado3, 2) ||
           Math.pow(lado3, 2) == Math.pow(lado1, 2) + Math.pow(lado2, 2)){
            System.out.println("Es un triangulo rectangulo.");
        }else{
            System.out.println("No es un triangulo rectangulo.");
        }

    }    
}
