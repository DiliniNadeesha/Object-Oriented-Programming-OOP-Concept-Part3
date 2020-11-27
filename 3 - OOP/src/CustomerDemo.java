public class CustomerDemo {

    static{
        System.out.println("Customer DEMO Acchuwa enawao...");
    }

    public static void main(String[] args) {
        Customer gaka = new Customer("C001", "Gaka", "Kurunagala");
        gaka.printDetails();
        Customer chiki = new Customer("C002", "Chiki", "Rathmalana");
        chiki.printDetails();
    }

}
