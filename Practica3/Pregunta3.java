import java.util.Scanner;
public class Pregunta3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precio = scan.nextInt();
        double porcentajeDescuento = scan.nextInt();
        double precioFinal = precio - (precio * porcentajeDescuento / 100);
        System.out.println(precioFinal);
    }
}
