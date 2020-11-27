public class DynamicArrayDemo {

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(10);
        da.add(20);
        da.add(30);
        da.printAll();
        da.add(new int[]{40,50,60});
        da.printAll();
        System.out.println(da.get(5));
        da.remove(4);;
        da.printAll();
    }

}
