import java.util.Scanner;
public class Pregunta2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int edad = scan.nextInt();
        if(edad >= 18){
            System.out.println("Es mayor de edad.");
        }else{
            System.out.println("Es menor de edad.");
        }
    }
}
