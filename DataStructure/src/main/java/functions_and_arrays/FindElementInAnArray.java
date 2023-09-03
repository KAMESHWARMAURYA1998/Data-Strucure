package functions_and_arrays;

public class FindElementInAnArray {
    /*
    * you are given a number n, representing a size of array a
    * you are given n numbers, representing elements array a
    * you are given another number d
    * you are required to check if d number exists in the array a and at what index, if found print the index otherwise print -1
    * */

    public static int findElement(int n, int array[], int d){
        for (int i=0;i<n;i++){
            if (d==array[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] = {3,4,6,7,9};
        int result = findElement(5,array,9);
        System.out.print(result);

    }
}
