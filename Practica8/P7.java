public class P7 {
    public static void main(String[] args) {
        String text = "12345";
        String result = reverse(text);
        System.out.println(result);
    }
    static String reverse(String text) {
        String result = "";
        for(int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }   
}
