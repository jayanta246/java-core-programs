package programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Reverse_String {
    public String reverseOfString(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Not a Valid Input");
        }
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }

    public void reverseArray(int [] array){
        for(int i=0; i<(array.length-1)/2; i++){
            int temp = array[i];
            array[i] = array[(array.length)-i-1];
            array[(array.length)-i-1] = temp;
        }
        System.out.println("Reverse array is" + Arrays.toString(array));
    }
}
/*
since String in java is immutable but using string builder class we can make it as mutable object
 */