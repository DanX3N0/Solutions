import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        int ai = 1;
        while(i<n){
            System.out.print(ai + " ");
            ai += 2;
            i++;
        }
    }    
}
