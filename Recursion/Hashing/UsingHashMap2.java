// String Hashing using the HashMap
import java.util.*;

public class UsingHashMap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string (all lowercase): ");
        String str = sc.nextLine();

        Map<Character, Integer> mpp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : mpp.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.print("Enter character to search: ");
            char ch = sc.next().charAt(0);
            System.out.println(mpp.getOrDefault(ch, 0));
        }

        sc.close();
    }
}
