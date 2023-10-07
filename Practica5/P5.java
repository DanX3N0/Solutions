import java.util.Scanner;
public class P5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int numeroInvertido = 0;
        while(numero > 0){
            int digito = numero % 10;
            numeroInvertido = (numeroInvertido * 10) + digito;
            numero /= 10;
        }
        System.out.println(numeroInvertido);
    }
}
