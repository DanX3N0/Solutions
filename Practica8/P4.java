public class P4 {
    public static void main(String[] args) {
        int numbers[] = {2, 5, 7, 9, 2, 5};
        double result = averagePrimes(numbers);
        System.out.println(result);
    }    
    static double averagePrimes(int numbers[]) {
        double result;
        double sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(isPrime(numbers[i])) {
                sum += numbers[i];
            }
        }
        result = sum / numbers.length;
        return result;
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
