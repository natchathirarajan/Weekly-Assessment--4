import java.util.TreeSet;
public class RemoveLastElement {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Banana");
        treeSet.add("Mango");
        // retrieve and remove the last element of the tree set
        String lastElement = treeSet.pollLast();
        // print the last element
        System.out.println("The last element of the tree set is: " +lastElement);
        //The tree set after removing the last element
        System.out.println("The tree set after removing the last element:" + treeSet);
    }
} 