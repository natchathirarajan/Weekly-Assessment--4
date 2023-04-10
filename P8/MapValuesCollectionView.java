import java.util.HashMap;
import java.util.Collection;

public class MapValuesCollectionView {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("English", "95");
        hashMap.put("Maths", "100");
        hashMap.put("Science", "85");

// get the collection view of the values in the map 
        Collection<String> values = hashMap.values();

// print the values 
        System.out.println("The values in the map: " + values);
    }
} 