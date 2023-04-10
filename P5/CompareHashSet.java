import java.util.HashSet;

public class CompareHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Apple");
        hashSet1.add("Orange");
        hashSet1.add("Grapes");

        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("Banana");
        hashSet2.add("Pineapple");
        hashSet2.add("Mango");

// compare the two hash sets 
        boolean areEqual = hashSet1.equals(hashSet2);

// print the result 
        if (areEqual) {
            System.out.println("The two hash sets are equal.");
        } else {
            System.out.println("The two hash sets are not equal.");
        }
    }
}