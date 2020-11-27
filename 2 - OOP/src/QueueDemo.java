public class QueueDemo {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
    }

}
