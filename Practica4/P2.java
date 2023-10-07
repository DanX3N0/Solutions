import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i=0;
        int contador = 0;
        while(i<n){
            char caracter = scan.next().charAt(0);
            if(caracter == 'a' || caracter == 'e' || caracter == 'i'
               || caracter == 'o' || caracter == 'u'){
                System.out.print(caracter + " ");
                contador++;
            }
            i++;
        }

        System.out.println("\n" + contador);
    }    
}
