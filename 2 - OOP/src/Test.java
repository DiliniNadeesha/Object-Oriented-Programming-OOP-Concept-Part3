import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Test {

    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        ArrayList<Object> da = new ArrayList<>();
        da.add(10);
        da.add(20);

        Stack<Object> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
    }

}
