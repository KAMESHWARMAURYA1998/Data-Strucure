package functions_and_arrays;

public class CeilAndFloor {

    public static void ceilAndFloor(int arr[], int data){
        int low= 0;
        int high = arr.length-1;
        int ceil = 0;
        int floor = 0;
        while (low<=high){
            int mid = (low+high)/2;
            if (data<arr[mid]){
                high = mid-1;
                ceil = arr[mid];
            }else if(data>arr[mid]){
                low = mid+1;
                floor = arr[mid];
            }else {
               floor = arr[mid];
               ceil = arr[mid];
               break;
            }
            low++;
            high--;
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
    public static void main(String[] args) {
    int arr[] = {10,20,30,40,50,60,70};
      ceilAndFloor(arr,50);
    }
}
