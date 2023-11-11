import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        StackString stackA = new StackString(n);
        
        while(!stackA.isFull()) {
            String name = scan.nextLine();
            stackA.push(name);
        }

        String shortName = stackA.pop();

        while (!stackA.isEmpty()) {
            String name = stackA.pop();
            if(name.length() < shortName.length()) {
                shortName = name;
            }
        }

        System.out.println(shortName);

    }
}
