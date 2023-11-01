import java.util.Scanner;
public class P7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            int numero = scan.nextInt();
            a[i] = numero;
        } 

        int m = scan.nextInt();
        int b[] = new int[m];
        for(int i = 0; i < m; i++) {
            int numero = scan.nextInt();
            b[i] = numero;
        } 
        
        if(n > m) {
            for(int i = 0; i < n; i++) {
                if(i < m) {
                    System.out.println(a[i]+b[i]);
                }else {
                    System.out.println(a[i]);
                }
            } 
        }else {
           for(int i = 0; i < m; i++) {
                if(i < n) {
                    System.out.println(a[i]+b[i]);
                }else {
                    System.out.println(b[i]);
                }
            }  
        }

    }  
}
