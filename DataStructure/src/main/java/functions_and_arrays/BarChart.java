package functions_and_arrays;

public class BarChart {

    public static int getMaxValue(int arr[]){
        int maxValue = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static void barChart(int n, int arr[]){
        int max = getMaxValue(arr);
        for(int floor =max;floor>0;floor--){
            for (int i=0;i<n;i++){
                if (arr[i]>=floor){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,1,0,7,5};
        barChart(5,arr);

    }
}
