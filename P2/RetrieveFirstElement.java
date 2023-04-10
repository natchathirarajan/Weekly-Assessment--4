import java.util.LinkedList;
public class RetrieveFirstElement {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Ant");
        linkedList.add("Butterfly");
        linkedList.add("Caterpillar");
        linkedList.add("Dragonfly");
        // retrieve but does not remove the first element of the linked list
        String firstElement = linkedList.peekFirst();
        // print the first element
        System.out.println("The first element of the linked list is: " + firstElement);
    }
}