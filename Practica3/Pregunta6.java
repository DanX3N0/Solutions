import java.util.Scanner;
public class Pregunta6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char caracter = scan.next().charAt(0);
        int numero = Integer.parseInt(Character.toString(caracter));
        System.out.println(numero);
    }
}
