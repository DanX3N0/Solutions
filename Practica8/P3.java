public class P3 {
    public static void main(String[] args) {
        int number = 5;
        boolean result = isPrime(number);
        System.out.println(result);
    }   
    static boolean isPrime(int number) {
        int count = 0;
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) count++;
        }
        if(count == 2) return true;
        return false;
    } 
}
