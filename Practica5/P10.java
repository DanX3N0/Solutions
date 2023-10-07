import java.util.Scanner;
public class P10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cadena = scan.next();
        String removidos = "";
        int contador = 0;
        for(int i = 0; i < cadena.length(); i++){
            char caracter = cadena.charAt(i);
            if(!removidos.contains(Character.toString(caracter))){
                for(int j = 0; j < cadena.length(); j++){
                    if(caracter == cadena.charAt(j) && i != j){
                        contador++;
                        removidos = removidos.concat(Character.toString(caracter));
                        break;
                    }
                }
            }
        }
        System.out.println(contador);
    }
}
