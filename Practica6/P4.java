import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arreglo[] = new int[n];

        for(int i = 0; i < n; i++) {
            int numero = scan.nextInt();
            arreglo[i] = numero;
        } 
        int mayor = -1;
        for(int i = 0; i < n; i++) {
            if(arreglo[i] > mayor) 
                mayor = arreglo[i];
        }
        System.out.println(mayor);
    }  
}
