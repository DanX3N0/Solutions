import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arreglo[] = new int[n];

        for(int i = 0; i < n; i++) {
            int numero = scan.nextInt();
            arreglo[i] = numero;
        }   

        for(int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        } 

    }
}
