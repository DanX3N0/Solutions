import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arreglo[] = new int[n];

        for(int i = 0; i < n; i++) {
            int numero = scan.nextInt();
            arreglo[i] = numero;
        } 

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                System.out.println(arreglo[i] + " ");
            }
        } 
    }  
}
