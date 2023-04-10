import java.util.LinkedList;

public class CheckElement{
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Aeroplane");
        linkedList.add("Bike");
        linkedList.add("Boat");
        linkedList.add("Car");

// check if "element 2" exists in the linked list 
        boolean elementExists = linkedList.contains("Boat");

// print the result 
        if (elementExists) {
            System.out.println("The linked list contains ’Boat’.");
        } else {
            System.out.println("The linked list does not contain ’Boat’.");
        }
    }
} 