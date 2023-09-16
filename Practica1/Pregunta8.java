import java.util.Scanner;
public class Pregunta8 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int velocidad = scan.nextInt();
        if(velocidad > 90){
            System.out.println("exedio el limite.");
        }else{
            System.out.println("no se supero el limite.");
        }
    }
}
