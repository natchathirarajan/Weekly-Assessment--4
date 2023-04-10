import java.util.HashMap;
import java.util.Set;

public class MapKeysSetView {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("English", "95");
        hashMap.put("Maths", "100");
        hashMap.put("Science", "85");

// get the set view of the keys in the map 
        Set<String> keys = hashMap.keySet();

// print the keys 
        System.out.println("The keys in the map: " + keys);
    }
} 