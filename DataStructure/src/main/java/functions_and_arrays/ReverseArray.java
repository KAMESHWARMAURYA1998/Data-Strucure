package functions_and_arrays;

public class ReverseArray {

    public static int[] reverseArray(int arr[]){
        int i=0;
        int j=arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void printArray(int arr[]){
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {

        int arr[] = {3,4,5,6,7};
        int result[] = reverseArray(arr);
        printArray(result);

    }
}
