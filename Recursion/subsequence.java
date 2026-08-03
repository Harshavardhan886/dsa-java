import java.util.*;
public class subsequence {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        List<Integer> current = new ArrayList<>();
        f(0, arr, current);
    }

    // recursive function
    static void f(int index, int[] arr, List<Integer> current) {
        if(index == arr.length) {
            System.out.println(current); // print one subsequence
            return;
        }

        // include arr[index]
        current.add(arr[index]);
        f(index + 1, arr, current);

        // exclude arr[index]
        current.remove(current.size() - 1);
        f(index + 1, arr, current);
    }

}
