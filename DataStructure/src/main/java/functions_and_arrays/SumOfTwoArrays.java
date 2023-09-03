package functions_and_arrays;

public class SumOfTwoArrays {
    /*
    * you are given a number n1, representing the size of array a1
    * you are given n1 numbers, representing the elements of array a1
    * you are given a number n2, representing the size of array a2
    * you are given n2 numbers, representing the elements of array a2
    * the two array represent the digits of two numbers
    * you are required to add the number represented by two arrays and print the array
    *
    * */

    public static void sumOfTwoArray(int a1[],int a2[]){
        int sum[] = new int[a1.length>a2.length?a1.length:a2.length];
        int i = a1.length-1;
        int j = a2.length-1;
        int k = sum.length-1;
        int c = 0;
        while (k>=0){
            int d = c;
            if (i>=0){
                d = d+a1[i];
            }
            if (j>=0){
                d= d+ a2[j];
            }
            c = d/10;
            d = d%10;
            sum[k] = d;
            i--;
            j--;
            k--;
        }
        if (c!=0){
            System.out.print(c);
        }
        for (int val:sum){
            System.out.print(val);
        }
    }
    public static void main(String[] args) {
        int a1[] = {9,9,9};
        int a2[] = {1};
        sumOfTwoArray(a1,a2);
    }
}
