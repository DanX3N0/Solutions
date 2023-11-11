import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        StackInteger stackA = new StackInteger(n);
        StackInteger stackB = new StackInteger(n);
        
        while(!stackA.isFull()) {
            int number = scan.nextInt();
            stackA.push(number);
        }

        while (!stackA.isEmpty()) {
            int data = stackA.pop();
            if(data % 2 == 0) {
                stackB.push(data);
            }
        }

        while(!stackB.isEmpty()) {
            System.out.print(stackB.pop() + " ");
        }

    }   
}
