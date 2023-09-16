import java.util.Scanner;
public class Pregunta9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        if(numero % 3 == 0 && numero % 5 == 0){
            System.out.println("El numero es multiplo de 3 y 5.");
        }else if(numero % 3 == 0){
            System.out.println("El numero es multiplo de 3.");
        }else if(numero % 5 == 0){
            System.out.println("El numero es multiplo de 5.");
        }
    }
}
