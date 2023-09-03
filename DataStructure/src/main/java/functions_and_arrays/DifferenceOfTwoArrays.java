package functions_and_arrays;

public class DifferenceOfTwoArrays {

    /*
    * you are given a number n1, representing the size of array a1
    * you are given n1 numbers, representing the elements of array a1
    * you are given a number n2, representing the size od array a2
    * you are given n2 numbers, representing the elements of array a2
    * the two array represent the digits of two numbers
    * you are required to find difference of two numbers represented by two arrays and print the arrays. a2-a1
    *
    * assumption : number represented by a2 is grater
    * */

    public static void differenceOfTwoArrays(int a1[], int a2[]){
        int i = a1.length-1;
        int j = a2.length-1;
        int diff[] = new int[a2.length];
        int k = diff.length-1;
        int c = 0;
        while (k>=0){
            int d= 0;
            int a1Val = a1[i]>0?a1[i]:0;
            if (j+c>=0){
                d = a2[j]+c - a1Val;
                diff[k] = d;
                c= 0;
            }else {
                d = a2[j]+c+10 - a1Val;
                c= -1;
                diff[k] = d;
            }
            i--;
            j--;
            k--;
        }

        int idx = 0;
        while (idx<diff.length){
            if (diff[idx] == 0){
                idx++;
            }else {
                break;
            }
        }

        while (idx<diff.length){
            System.out.print(diff[idx]+" ");
            idx++;
        }

    }
    public static void main(String[] args) {
        int a1[] = {999};
        int a2[] = {1000};
        differenceOfTwoArrays(a1,a2);

    }
}
