public class Customer {

    static String name2 = "IJSE";

    static {
        System.out.println(name2);
    }

    String id;
    String name;
    String address;

    Customer(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void printDetails() {
        System.out.println("Customer[ID=" + id + ", NAME=" + name
                + ", ADDRESS=" + address + "]");
    }

}
