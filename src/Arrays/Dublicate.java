package Arrays;
import java.util.HashMap;

public class Dublicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 4};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        System.out.println("Element counts: " + map);
    }
}