import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int i = 1;
        while(i<=numero){
            if(numero % i == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }       
}
