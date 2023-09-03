package functions_and_arrays;

public class SubArraysOfArray {

    public static void subArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j = i;j<arr.length;j++){
                for (int k = i;k<j;k++){
                    System.out.print(arr[k]+"\t");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
      int arr[] = {2,3,4,5,6};
      subArray(arr);
    }
}
