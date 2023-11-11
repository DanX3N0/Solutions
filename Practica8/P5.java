public class P5 {
    public static void main(String[] args) {
        int numbers[] = {55, 77, 22, 1, 0, 66, 99, 33};
        int result = findMax(numbers);
        System.out.println(result);
    }
    static int findMax(int numbers[]) {
        int result = -1;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > result) result = numbers[i];
        }
        return result;
    }
}
