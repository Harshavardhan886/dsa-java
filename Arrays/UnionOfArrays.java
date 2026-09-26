import java.util.*;

// method 1: Brute force
public class UnionOfArrays {
     public static void main(String[] args) {
         Set<Integer> set = new LinkedHashSet<>();
         int[] arr1 = {1,1,2,3,4,5};
         int[] arr2 = {2,3,4,4,5,6};
         for(int i = 0; i<arr1.length; i++){
             set.add(arr1[i]);
            }
            for(int i = 0; i<arr2.length; i++){
                set.add(arr2[i]);
            }
        int[] union = new int[set.size()]; 
        int i = 0;
        for(int num : set){
            union[i] = num;
            i++;
        }
        System.out.println(Arrays.toString(union));
    }
}
