import java.util.Scanner;
public class P6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        int numeroBase = 2;
        while(i < n){
            int contador = 0;
            for(int j = 1; j <= numeroBase; j++){
                if(numeroBase % j == 0){
                    contador++;
                }
            }
            if(contador == 2){
                System.out.print(numeroBase + " ");
                numeroBase++;
                i++;
            }else{
                numeroBase++;
            }
        }
    }
}
