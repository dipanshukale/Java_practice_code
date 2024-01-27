package DSA_practice;

public class String_Palindrome {
    public static boolean isPalindrome(String str){
        for (int i=0; i<str.length(); i++){
            int n = str.length();

            if (str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrome
                System.out.println("Your String is not a palindrome");
                return false;
            }
        }

        System.out.println("Your String is Palindrome");
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
}
