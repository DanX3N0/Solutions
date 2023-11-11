public class P9 {
    public static void main(String[] args) {
        int numbers[] = {5, 7, 2, 1, 8};
        sort(numbers);
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    static void sort(int numbers[]) {
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]) {
                    int aux = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = aux;
                }
            }
        }
    }
}
