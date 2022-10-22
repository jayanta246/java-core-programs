import DataStructure.BinarySearch;
import programs.*;

public class Main {
    public static void main(String[] args) {
        Reverse_String rs = new Reverse_String();
        SwapTwoNumber st = new SwapTwoNumber();
        Fibonacci_Series fs = new Fibonacci_Series();
        PrimeNumber pn = new PrimeNumber();
        Palindrome p = new Palindrome();
        Armstrong a = new Armstrong();
        RM_repeated_elements re = new RM_repeated_elements();
        Checking_Anagrams ca = new Checking_Anagrams();

        System.out.println("Reverse Of a String");
        String s = "ABCDEF";
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println(rs.reverseOfString(s));
        rs.reverseArray(array);

        System.out.println("swap two numbers");
        st.swapTwoNumber(5, 10);

        System.out.println("fibonacci number");
        System.out.println(fs.fibonacciSeries(10));

        System.out.println("check prime number");
        pn.checkPrime(10);

        System.out.println("check Palindrome String");
        p.checkPalindrome_string("jayanta");
        p.checkPalindrome_string("abba");

        System.out.println("check Palindrome number");
        p.checkPalindrome_number(3553);
        p.checkPalindrome_number(59873485);

        System.out.println("check Armstrong number");
        a.checkArmstrong(1536);
        a.checkArmstrong(153);

        System.out.println("Remove repeated elements");
        int[] array1 = {5, 2, 6, 8, 6, 7, 5, 2, 8};
        re.findRepeatedEle_set(array1);

        System.out.println("Check Anagram");
        String s1 = "listen";
        String s2 = "silent";
        ca.Anagrams(s1, s2);

        System.out.println("******Data Structure************");
        BinarySearch b = new BinarySearch();
        int array2[] = {3, 4, 5, 6, 7, 8, 9};
        int element = 4;
        int n = array2.length;
        int result_iterative = b.binarySearch_iteration(array2, element, 0, n - 1);
        if (result_iterative == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element at position " + result_iterative);
        }

        int result_recursive = b.binarySearch_recursive(array, element, 0, n - 1);
        if (result_recursive == -1) {
            System.out.println("Element not found using recursive method");
        } else {
            System.out.println("Element at position " + result_recursive + " using recursive method");
        }
    }
}