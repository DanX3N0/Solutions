import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        for(int i = 1; i <= 10; i++){
            int mult = numero * i;
            System.out.println(numero + " x " + i + " = " + mult);
        }
    }
}
