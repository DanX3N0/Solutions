import java.util.Scanner;
public class P9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cadena = scan.next();
        for(int i = 0; i < cadena.length(); i++){
            char caracter = cadena.charAt(i);
            if(caracter == 'a' || caracter == 'e' || caracter == 'i'
              || caracter == 'o' || caracter == 'u'){
                System.out.print(caracter + " ");
            }
        }
    }
}
