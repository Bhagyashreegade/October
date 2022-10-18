package Practice;

public class ReverseStringPalindrome {
    public static void main(String[] args) {

        String name = "MoM";
        String reverse = "";

        //1--->Using character array

        char[] a = name.toCharArray(); // converting String into char array
        int length = a.length;

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + a[i];
        }

        System.out.println("String after reversing is " + reverse);

        //2---> using string concatenation operator

//        int length = name.length();
//        for (int i = length - 1; i >= 0; i--) {
//            reverse = reverse + name.charAt(i);
//        }
//        System.out.println("The reverse String is ---" + reverse);


        //3--->Using String Buffer class

        StringBuffer sb = new StringBuffer(name);
        System.out.println("The reverse String is ---" + sb.reverse());


        //to check whether the given String is palindrome

        if (name.equalsIgnoreCase(reverse)) {
            System.out.println("The given String is palindrome");
        } else {
            System.out.println("The given String is not a palindrome");
        }
    }
}
