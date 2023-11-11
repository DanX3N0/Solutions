public class P6 {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7};
        boolean result = isOrdered(numbers);
        System.out.println(result);
    }
    static boolean isOrdered(int numbers[]) {
        for(int i = 0; i < numbers.length - 1; i++) {
                if(numbers[i] > numbers[i + 1]) return false;
        }
        return true;
    }
}
