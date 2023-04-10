import java.util.NavigableMap;
import java.util.TreeMap;

public class LeastKey {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(1, "80");
        map.put(3, "100");
        map.put(5, "75");
        map.put(7, "67");

// Get the least key greater than or equal to 6
        Integer key = map.ceilingKey(6);

        if (key != null) {
            System.out.println("Key: " + key);
        } else {
            System.out.println("No key found.");
        }
    }
}