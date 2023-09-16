import java.util.Scanner;
public class Pregunta3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char caracter = scan.next().charAt(0);
        if(caracter == 'a' || caracter == 'e' || caracter == 'i' || 
           caracter == 'o' || caracter == 'u'){
            System.out.println("Es vocal.");
        }else{
            System.out.println("Es consonante.");
        }
    }
}
