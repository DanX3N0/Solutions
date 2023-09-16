import java.util.Scanner;
public class Pregunta10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int primerNota = scan.nextInt();
        int segundaNota = scan.nextInt();
        int tercerNota = scan.nextInt();
        int sumaMejoresNotas;

        if(primerNota >= segundaNota  && primerNota >= tercerNota){
            if(segundaNota >= tercerNota){
                sumaMejoresNotas = primerNota + segundaNota;
            }else{
                sumaMejoresNotas = primerNota + tercerNota;
            }
        }else if(segundaNota >= primerNota && segundaNota >= tercerNota){
            if(primerNota >= tercerNota){
                sumaMejoresNotas = segundaNota + primerNota;
            }else{
                sumaMejoresNotas = segundaNota + tercerNota;
            }
        }else{
            if(primerNota >= segundaNota){
                sumaMejoresNotas = tercerNota + primerNota;
            }else{
                sumaMejoresNotas = tercerNota + segundaNota;
            }
        }
        System.out.println(sumaMejoresNotas);
    }
}
