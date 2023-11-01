import java.util.Scanner;
public class P10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char arreglo[] = new char[n];
        for(int i = 0; i < n; i++) {
            char caracter = scan.next().charAt(0);
            arreglo[i] = caracter;
        } 
        char elementoABuscar = scan.next().charAt(0);
        int pos = -1;
        for(int i = 0; i < n; i++) {
            if(arreglo[i] == elementoABuscar) {
                pos = i;
                break;
            }
        }
        if(pos == -1) {
            System.out.println("El elemento no se encontro.");
        }else {
            System.out.println(pos);
        }
    }  
}