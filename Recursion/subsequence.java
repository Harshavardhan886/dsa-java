import java.util.*;
public class subsequence {

    
    static int[] arr = {3, 1, 2};   // Class variable
    static void findSubsequences(int index, ArrayList<Integer> list) {

        if (index == arr.length) {
            System.out.println(list);
            return;
        }

        list.add(arr[index]);
        findSubsequences(index + 1, list);

        list.remove(list.size() - 1);
        findSubsequences(index + 1, list);
    }

    public static void main(String[] args) {
        findSubsequences(0, new ArrayList<>());
    }
}


