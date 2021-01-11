import java.util.ArrayList;
import java.util.Arrays;

public class Sorter {

    public Sorter(){}

    public ArrayList<Integer> sort(ArrayList<Integer> input){

        int[] arr = new int[input.size()];

        for(int i = 0; i < input.size(); i++){
            arr[i] = input.get(i);
        }

        for(int i = 1; i < arr.length; i++){

            int j = i;

            while(j > 0 && arr[j - 1] < arr[j]){
                swap(j, j-1, arr);
                j--;
            }

        }

        ArrayList<Integer> bucket = new ArrayList<>();

        for(int i = arr.length - 1; i >= 0; i--){
            bucket.add(arr[i]);
        }




        return bucket;
    }

    public static void swap(int i, int j, int[] list){
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

}
