
import java.util.PriorityQueue;

public class CustomerSupportTicketScheduler {
    private static final PriorityQueue<Ticket> ticketQueue = new PriorityQueue<>((a, b) -> {
        int priorityCompare = Integer.compare(b.priority, a.priority);
        if (priorityCompare != 0) {
            return priorityCompare;
        }
        return Integer.compare(a.timestamp, b.timestamp);
    });

    public static void main(String[] args) {
        System.out.println("***** Incoming Ticket *****");
        addTicket("T01", 1, 100);
        addTicket("T02", 2, 101);
        addTicket("T03", 6, 103);
        addTicket("T04", 7, 108);
        addTicket("T05", 9, 108);
        addTicket("T06", 3, 109);

        System.out.println("\n***** Processed Ticket Order *****");
        while (!ticketQueue.isEmpty()) {
            System.out.println(ticketQueue.poll());
        }
    }

    private static void addTicket(String id, int priority, int timestamp) {
        Ticket ticket = new Ticket(id, priority, timestamp);
        ticketQueue.offer(ticket);
        System.out.println("Added: " + ticket);
    }

    private static class Ticket {
        private final String id;
        private final int priority;
        private final int timestamp;

        private Ticket(String id, int priority, int timestamp) {
            this.id = id;
            this.priority = priority;
            this.timestamp = timestamp;
        }

        @Override
        public String toString() {
            return "Ticket{id='" + id + "', priority=" + priority + ", timestamp=" + timestamp + "}";
        }
    }
}

//Higthset priority Queue 
// thaneshwara848/SJBIT_DSA.git