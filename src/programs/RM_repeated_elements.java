package programs;

import java.util.LinkedHashSet;

public class RM_repeated_elements {
    public void findRepeatedEle_set(int[] array){
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for(int i=0; i<array.length; i++){
            linkedHashSet.add(array[i]);
        }

       System.out.println(linkedHashSet);
    }

}

/*
sets doesn't allow duplicate
LinkedHashSet also maintain the insertion order
 */
