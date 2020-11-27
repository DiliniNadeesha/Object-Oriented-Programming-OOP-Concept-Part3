import java.util.Arrays;

public class DynamicArray {

    int[] values;

    DynamicArray(){
        values = new int[0];
    }

    void add(int value){
        int[] temp = new int[values.length + 1];
        for (int i = 0; i < values.length; i++) {
            temp[i] = values[i];
        }
        temp[temp.length - 1]= value;
        values = temp;
    }

    void add(int[] values){
        int[] temp = new int[this.values.length + values.length];
        for (int i = 0; i < temp.length; i++) {
            if (i >= this.values.length){
                temp[i] = values[i -this.values.length];
            }else{
                temp[i] = this.values[i];
            }
        }
        this.values = temp;
    }

    int get(int index){
        if (index > (values.length -1) || index < 0){
            System.out.println("Failed to retrieve: Invalid index");
            return -1;
        }
        return values[index];
    }

    void remove(int index){
        if (index > (values.length -1) || index < 0){
            System.out.println("Failed to remove: Invalid index");
            return;
        }
        int temp[] = new int[values.length -1];
        for (int i = 0; i < temp.length; i++) {
            if (i >= index){
                temp[i] = values[i+1];
            }else{
                temp[i] = values[i];
            }
        }
        values = temp;
    }

    void printAll(){
        System.out.println(Arrays.toString(values));
    }

    int getSize(){
        return values.length;
    }
}
