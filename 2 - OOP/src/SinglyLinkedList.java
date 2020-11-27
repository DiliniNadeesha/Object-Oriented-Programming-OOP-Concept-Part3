public class SinglyLinkedList {

    Node head = null;
    int size = 0;

    void add(int value){
        size++;
        if (head == null) {
            head = new Node(value, null);
        }else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(value, null);
        }
    }

    void remove(int index){
        size--;
        if (index == 0){
            head = head.next;
            return;
        }
        int i = 0;
        Node temp = head;
        while (temp.next != null){
            if ((i + 1) == index){
                break;
            }
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    int get(int index){
        return -1;
    }

    int size(){
        return size;
    }

    void printAll(){
        if (size == 0){
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            System.out.print(temp.value + ",");
            temp = temp.next;
        }
        System.out.println(temp.value);
    }

    void clear(){
        head = null;
        size =0;
    }

}
