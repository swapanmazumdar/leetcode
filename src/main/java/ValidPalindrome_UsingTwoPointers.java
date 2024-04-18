public class ValidPalindrome_UsingTwoPointers {

    public boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ValidPalindrome_UsingTwoPointers()
                .isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(new ValidPalindrome_UsingTwoPointers()
                .isPalindrome("race a car"));
        System.out.println(new ValidPalindrome_UsingTwoPointers()
                .isPalindrome(" "));
    }
}
