package Practice;

public class ReverseStringPalindrome {
    public static void main(String[] args) {

        String name = "MoM";
        char[] chars = name.toCharArray(); // converting String into char array
        char[] reverseArray = new char[name.length()]; //initializing an empty array

        int length = chars.length;
        int lastIndex = length - 1;

        for (int i = 0; i <= lastIndex; i++) {
            reverseArray[lastIndex - i] = chars[i];
        }
        String reverse = new String(reverseArray);
        System.out.println("String after reversing is " + reverse);

        //to check whether the given String is palindrome

        if(name.equalsIgnoreCase(reverse)){
            System.out.println("The given String is palindrome");
        }else{
            System.out.println("The given String is not a palindrome");
        }
    }
}
