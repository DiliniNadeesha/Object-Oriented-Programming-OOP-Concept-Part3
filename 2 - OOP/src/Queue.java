public class Queue {

    DynamicArray da;

    Queue(){
        this.da = new DynamicArray();
    }

    void enqueue(int value){
        da.add(value);
    }

    void dequeue(){
        if (da.getSize() == 0){
            System.out.println("Failed to dequeue: Queue size is zero");
            return;
        }
        da.remove(0);
    }

    int peekFirst(){
        if (da.getSize() == 0){
            System.out.println("Failed to dequeue: Queue size is zero");
            return -1;
        }
        return da.get(0);
    }

    int peekLast(){
        if (da.getSize() == 0){
            System.out.println("Failed to dequeue: Queue size is zero");
            return -1;
        }
        return da.get(da.getSize() -1);
    }

    void printQueue(){
        if (da.getSize() == 0) {
            return;
        }
        for (int i = da.getSize() - 1; i >=0 ; i--) {
            System.out.print(da.get(i) + " | ");
        }
        System.out.println();
    }

}
