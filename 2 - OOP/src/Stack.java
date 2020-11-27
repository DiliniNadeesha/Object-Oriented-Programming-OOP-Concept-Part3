public class Stack {

    DynamicArray da;

    Stack(){
        this.da = new DynamicArray();
    }

    void push(int value){
        da.add(value);
    }

    void pop(){
        da.remove(da.getSize() - 1);
    }

    int peek(){
        if (da.getSize() == 0){
            return 0;
        }
        return da.get(da.getSize() - 1);
    }

    void printStack(){
        for (int i = da.getSize() - 1; i >=0; i--) {
            System.out.println("|" + da.get(i) + "|");
        }
    }

}
