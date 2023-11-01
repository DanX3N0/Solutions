import java.util.Scanner;
public class P8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arreglo[] = new int[n];
        for(int i = 0; i < n; i++) {
            int numero = scan.nextInt();
            arreglo[i] = numero;
        } 
        int mayorOcurrencia = -1;
        for(int i = 0; i < n; i++) {
            int contador = 1;
            int elemento = arreglo[i];
            for(int j = i + 1; j < n; j++) {
                if(arreglo[i] == arreglo[j]) {
                    contador++;
                }
            }
            if(contador > mayorOcurrencia)
                mayorOcurrencia = elemento;
        }
        System.out.println(mayorOcurrencia);
    }  
}