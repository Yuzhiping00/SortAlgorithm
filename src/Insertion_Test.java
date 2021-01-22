import java.util.Arrays;

public class Insertion_Test {
    public static void main(String[] args) {
        int[] array = {1,3, 2, 7,10, 8, 9};
        insertSorting(array);
        System.out.println(Arrays.toString(array));
    }
    public static void insertSorting(int[] array){
        int unsortedValue;
        int scan;
        for(int index = 1; index < array.length; index++){
            unsortedValue = array[index];
            scan = index;
            while(scan > 0 && array[scan-1] > unsortedValue){
                array[scan]= array[scan-1];
                scan--;
            }
            array[scan] = unsortedValue;
        }
        }


}
