import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int m = scan.nextInt();
        StackInteger stackA = new StackInteger(m);
        while(!stackA.isFull()) {
            int number = scan.nextInt();
            stackA.push(number);
        }

        int n = scan.nextInt();
        StackInteger stackB = new StackInteger(n);
        while(!stackB.isFull()) {
            int number = scan.nextInt();
            stackB.push(number);
        }

        while(!stackA.isEmpty() || !stackB.isEmpty()) {
            if(!stackA.isEmpty()) {
                System.out.print(stackA.pop() + " ");
            }
            if(!stackB.isEmpty()) {
                System.out.print(stackB.pop() + " ");
            }
        }

    }
}
