import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroDeTerminos = scan.nextInt();

        int numerador = 1;
        int denominador = 2;

        for(int i = 0; i < numeroDeTerminos; i++) {
            System.out.println(numerador + "/" + denominador);
            numerador += 2;
            denominador += 2;
        }
    }
}
