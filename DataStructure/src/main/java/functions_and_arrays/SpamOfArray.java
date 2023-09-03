package functions_and_arrays;

public class SpamOfArray {

    /*
    * you are given a number n, representing the count of element
    * you are given n numbers
    * you are required to find the spam of input, Span is defined as difference of maximum value and minimum value
    *
    * */

    public static int getMinValue(int arr[], int size){
        int minValue = arr[0];
        for (int i =1;i<size;i++){
            if (arr[i]<minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }

    public static int getMaxValue(int arr[], int size){
        int maxValue = arr[0];
        for (int i=1;i<size;i++){
            if (arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static int spanOfArray(int n, int arr[]){
        int maxValue = getMaxValue(arr,n);
        int minValue = getMinValue(arr,n);
        return maxValue-minValue;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,4,5,6};
        int result = spanOfArray(5,arr);
        System.out.print(result);

    }
}
