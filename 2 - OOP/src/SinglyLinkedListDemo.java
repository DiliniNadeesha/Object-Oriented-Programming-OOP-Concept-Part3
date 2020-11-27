public class SinglyLinkedListDemo {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.printAll();
        list.remove(0);
        list.printAll();
    }

}
