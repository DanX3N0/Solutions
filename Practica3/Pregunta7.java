import java.util.Scanner;
public class Pregunta7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int primerNumero = scan.nextInt();
        int segundoNumero = scan.nextInt();
        int tercerNumero = scan.nextInt();
        
        if(primerNumero >= segundoNumero && primerNumero >= tercerNumero){
            if(segundoNumero >= tercerNumero){
                System.out.println(tercerNumero + " " + segundoNumero + " " + primerNumero);
            }else{
                System.out.println(segundoNumero + " " + tercerNumero + " " + primerNumero);
            }
        }else if(segundoNumero >= primerNumero && segundoNumero >= tercerNumero){
            if(primerNumero >= tercerNumero){
                System.out.println(tercerNumero + " " + primerNumero + " " + segundoNumero);
            }else{
                System.out.println(primerNumero + " " + tercerNumero + " " + segundoNumero);
            }
        }else{
            if(primerNumero >= segundoNumero){
                System.out.println(segundoNumero + " " + primerNumero + " " + tercerNumero);
            }else{
                System.out.println(primerNumero + " " + segundoNumero + " " + tercerNumero);
            }
        }
        
    }
}