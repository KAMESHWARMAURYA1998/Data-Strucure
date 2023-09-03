package functions_and_arrays;

public class InverseOfAnArray {
    /*
    * you are given a number n, representing the size of array a
    * you are given n numbers representing elements of array a
    * you are required to calculate the inverses of array a
    * */

    public static void inverseOfArray(int arr[]){
        int inv[] = new int[arr.length];
        for (int i = 0;i<arr.length;i++){
            int v = arr[i];
            inv[v] = i;
        }
        for (int a:inv){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,4,3,2};
      inverseOfArray(arr);
    }
}
