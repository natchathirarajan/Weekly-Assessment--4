import java.util.HashSet;

public class RemoveHashElements{
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Pineapple");

// remove all elements from the hash set 
        hashSet.clear();

// print the hash set 
        System.out.println("The hash set after removing all elements: " + hashSet);
    }
} 