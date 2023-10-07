import java.util.Scanner;
public class P8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroDecimal = scan.nextInt();
        String hex = "0123456789ABCDEF";
        String resultado = "";
        while(numeroDecimal > 16){
            int resto = numeroDecimal % 16;
            resultado = hex.charAt(resto) + resultado;
            numeroDecimal /= 16;
        }
        resultado = hex.charAt(numeroDecimal) + resultado;
        System.out.println(resultado);
    }
}
