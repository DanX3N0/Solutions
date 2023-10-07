import java.util.Scanner;
public class P5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int contador = 0;
        while(numero > 0){
            numero /= 10;
            contador++;
        }
        System.out.println(contador);
    }
}
