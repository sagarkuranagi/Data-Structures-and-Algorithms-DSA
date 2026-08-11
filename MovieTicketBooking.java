// public static void main (String[] args){
//     Queue<Integer>queue = new Linkedlist<> {};
//     System.out.println("Is queue Empty? "+ queue.isEmpty());

//     queue.offer(10);
//     queue.offer(20);
//     queue.offer(30);
//     queue.offer(40);
//     System.out.println("\nAffer Enqueue:");
//     System.out.println("Queue : " + queue);

//     System.out.println("\n fornt Element :" + queue.peek());

//     System.out.println("Queue size : " +queue.size());
//     System.out.println("\nRemoved Element :" + queue.poll());
//     System.out.println("Queue : " + queue);

//     System.out.println("\nFornt Element : "+ queue.peek());
    
//     queue.poll();
//     queue.poll();

//     System.out.println("\nAffer Removing All Elemnet:");
//    System.out.println("Queue : " + queue);
//    System.out.println("Is Queue Empty? " + queue.isEmpty());

//    System.out.println("peak on Empty Queue : " + queue.peek());

import java.util.LinkedList;
import java.util.Queue;

public class MovieTicketBooking{
public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>(){};

    System.out.println("Welcome to DB Cinemas");
    System.out.println("Avenger: Endgame Ticket Booking Started");
    System.out.println("---------------------------");
    System.out.println("Enter the Customer name : " + queue);

    while(!queue.isEmpty()){
        System.out.println("Tickets Issued to :" + queue.poll());
        if(!queue.isEmpty()){
            System.out.println("Customer Waiting:"+queue);
        }else{
            
        }
    }

}
}
