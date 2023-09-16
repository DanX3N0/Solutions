import java.util.Scanner;
public class Pregunta10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double horas = scan.nextInt();
        double minutos = scan.nextInt();
        double tarifa = 2.5;
        
        double pagoHoras = horas * tarifa;
        double pagoMinutos = (minutos / 60) * tarifa;

        double resultado = pagoHoras + pagoMinutos;

        System.out.println(resultado);
    }
}
