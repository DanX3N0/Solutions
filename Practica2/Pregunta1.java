import java.util.Scanner;
public class Pregunta1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        if(numero == 0){
            System.out.println("el numero es igual a cero.");
        }else if(numero > 0){
            System.out.println("el numero es mayor a cero.");
        }else{
            System.out.println("el numero es menor a cero.");
        }
    }
}