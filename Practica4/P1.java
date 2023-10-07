import java.util.Scanner;
class P1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i=0;
        int sumaPares=0;
        int sumaImpares=0;
        while(i<n){
            int numero = scan.nextInt();
            if(numero%2 == 0) sumaPares += numero;
            else sumaImpares += numero;
            i++;
        }
        System.out.println("Par " + sumaPares);
        System.out.println("Impar " + sumaImpares);
    }
}