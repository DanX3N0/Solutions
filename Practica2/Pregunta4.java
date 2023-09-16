import java.util.Scanner;
public class Pregunta4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double dolares = scan.nextInt();
        double bolivianos = dolares * 6.86;
        System.out.println(bolivianos);
    }
}
