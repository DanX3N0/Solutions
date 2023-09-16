import java.util.Scanner;
public class Pregunta8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palabra1 = scan.nextLine();
        String palabra2 = scan.nextLine();
        if(palabra1.equals(palabra2)) System.out.println("Son iguales.");
        else System.out.println("No son iguales.");
    }
}
