import java.util.NavigableMap;
import java.util.TreeMap;

public class KeyMapping {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Grape");
        map.put(4, "Pineapple");

// Get the key-value mapping associated with the least key greater than or equal to 4 
        Integer key = map.ceilingKey(3);
        String value = key != null ? map.get(key) : null;

        if (value != null) {
            System.out.println("Key: " + key + ", Value: " + value);
        } else {
            System.out.println("No key found.");
        }
    }
}