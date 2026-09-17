// only for the sorted arrays.

// Method 1: Brute force, in 1st method we directly use the Set(it does not allow duplicates).
/* 
import java.util.*;

public class RemoveDuplicate {
   public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        Set<Integer> s = new HashSet<>(); 

        for (int num : arr) {
            s.add(num);
        }

        int index = 0;
        for (int it : s) {
            arr[index++] = it;
        }

        System.out.println(Arrays.toString(Arrays.copyOf(arr, index)));
    }
}
    */

// Method 2: we use topointer techniques

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
     int[] arr = {1,1,2,2,2,2,3,3};
     int i = 0;
     for(int j= 1; j<arr.length; j++){
      if(arr[i] != arr[j]){
        arr[i+1] = arr[j];
        i++;
      }
     }
     System.out.println(Arrays.toString(Arrays.copyOf(arr, i+1)));
    }
}
