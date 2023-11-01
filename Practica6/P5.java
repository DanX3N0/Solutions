import java.util.Scanner;
public class P5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arreglo[] = new int[n];

        for(int i = 0; i < n; i++) {
            int numero = scan.nextInt();
            arreglo[i] = numero;
        } 
        int contadorPares = 0;
        for(int i = 0; i < n; i++) {
            if(arreglo[i] % 2 == 0) contadorPares++;
        } 
        System.out.println(contadorPares);
    }  
}
