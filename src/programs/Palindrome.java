package programs;

public class Palindrome {

    public void checkPalindrome_string(String s){
        boolean result = true;
        for(int i=0; i<(s.length())/2; i++){
            if(s.charAt(i)!= s.charAt(s.length()-i-1)){
                result = false;
                break;
            }
        }
        if(result){
            System.out.println(s + " is a Palindrome");
        }
        else {
            System.out.println(s + " is not a Palindrome");
        }
    }

    public void checkPalindrome_number(int number){
        int originalNumber = number;
        int reverseNumber = 0;
        int reminder;
        while(number!=0){
            reminder = number %10;
            reverseNumber = reverseNumber * 10 + reminder;
            number = number/10;
        }

        if(originalNumber == reverseNumber){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}

/*
A palindrome string is one whose reverse is also the same string
2442
abba
 */