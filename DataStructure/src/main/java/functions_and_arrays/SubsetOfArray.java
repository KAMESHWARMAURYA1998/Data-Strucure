package functions_and_arrays;

public class SubsetOfArray {

    public static void subset(int arr[]){
        int limit = (int)Math.pow(2,arr.length);
        for (int i=0;i<limit;i++){
            String set="";
            int temp = i;
            for (int j=arr.length-1;j>=0;j--){
                int r = temp%2;
                temp = temp/2;
                if (r==0){
                 set = ""+""+set;
                }else {
                   set = arr[j]+set;
                }
            }
            System.out.println(set);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        subset(arr);

    }
}
