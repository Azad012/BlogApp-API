import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr1= new ArrayList<>();


        for(int i=0; i<=50; i++){
            if(i%2==0) {
                arr1.add(i);
            }
        }

        arr1.add(1, 5);
        System.out.println();
        System.out.println(arr1.isEmpty());

        System.out.println(arr1.hashCode());
        System.out.println(arr1.indexOf(5));
        System.out.println(arr1.contains(8));
        arr1.remove(1);
        arr1.remove(5);
        
        for (Integer i:arr1){
            System.out.print(i +" ");
        }
    }
}