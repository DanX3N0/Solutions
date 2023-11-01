import java.util.Scanner;
public class P9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char arreglo[] = new char[n];
        for(int i = 0; i < n; i++) {
            char caracter = scan.next().charAt(0);
            arreglo[i] = caracter;
        } 
        
        for(int i = 0; i < n; i++) {
            if(arreglo[i] == 'a' || arreglo[i] == 'e' || arreglo[i] == 'i' ||
               arreglo[i] == 'o' || arreglo[i] == 'u') {
                System.out.print(arreglo[i] + " ");
            }
        }

    }  
}