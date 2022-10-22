package programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Checking_Anagrams {
    boolean flag = true;

    public void Anagrams(String s1, String s2){
        if(s1.length() != s2.length()){
            flag = false;
        }
        String s11 = s1.toLowerCase();
        String s22 = s2.toLowerCase();
        char[] c1 =s11.toCharArray();
        char[] c2 = s22.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0;i<s1.length(); i++){
            if(c1[i]!=c2[i]){
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println("Anagrams");
        }else {
            System.out.println("Not an Anagram");
        }
    }
}
