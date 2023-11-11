public class P10 {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 1, 1, 5, 5, 1, 88};
        int result = mostRepeated(numbers);
        System.out.println(result);
    }
    static int mostRepeated(int numbers[]) {
        int result = 0;
        int maxCount = -1;
        for(int i = 0; i < numbers.length; i++) {
            int count = 0;
            for(int j = i; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) count++;
            }
            if(count > maxCount) {
                maxCount = count;
                result = numbers[i];
            }
        }
        return result;
    }
}
