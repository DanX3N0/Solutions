import java.util.Scanner;
public class Pregunta7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double numeroDecimal = scan.nextDouble();

        if(numeroDecimal == Math.floor(numeroDecimal)){
            System.out.println("es entero.");
        }else{
            System.out.println("no es entero.");
        }
    }
}
