public class MethodOverloadingDemo1 {

    static void myMethod(long a, short b, double d){
        System.out.println("myMethod1");
    }

    static void myMethod(byte a, long b, float f){
        System.out.println("myMethod2");
    }

    public static void main(String[] args) {
        byte c = 10;
        myMethod(c,10, 2.0f);
    }
}
