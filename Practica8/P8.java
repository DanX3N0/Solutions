public class P8 {
    public static void main(String[] args) {
        String text = "1221";
        boolean result = isPalindrome(text);
        System.out.println(result);
    }
    static boolean isPalindrome(String text) {
        String textReversed = reverse(text);
        if(text.equals(textReversed)) return true;
        return false;
    }
    static String reverse(String text) {
        String result = "";
        for(int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }  
}
