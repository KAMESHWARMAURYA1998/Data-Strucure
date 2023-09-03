package functions_and_arrays;

public class RotateAnArray {
    public static void rotateArray(int arr[], int k){

        k = k%arr.length;
        if (k<0){
            k = k+arr.length;
        }
        // part 1 reverse
        reverseArray(arr,0, arr.length-k-1);
        // part 2 reverse
        reverseArray(arr,arr.length-k,arr.length-1);
        // all reverse
        reverseArray(arr,0,arr.length-1);

        for (int a:arr){
            System.out.print(a+" ");
        }

    }

    public static void reverseArray(int arr[], int i, int j){
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
         rotateArray(arr,3);
    }
}
