import java.util.Scanner;
public class Pregunta2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt();
        if(nota >= 51){
            System.out.println("Aprobado.");
        }else{
            System.out.println("Reprobado.");
        }
    }    
}
