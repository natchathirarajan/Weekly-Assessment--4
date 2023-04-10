import java.util.PriorityQueue;

public class PriorityQueueToString {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Apple");
        priorityQueue.add("Orange");
        priorityQueue.add("Grapes");
        priorityQueue.add("Mango");

// convert the priority queue to a string representation 
        String queueAsString = priorityQueue.toString();

// print the string representation 
        System.out.println("The priority queue as a string: " + queueAsString);
    }
} 