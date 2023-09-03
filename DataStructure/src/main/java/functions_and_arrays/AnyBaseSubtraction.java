package functions_and_arrays;

public class AnyBaseSubtraction {

    /*
    * you are given a base b
    * you are given two numbers n1 and n2 of base b
    * you are required to subtract n1 from n2 and print the value
    *
    * */
    public static int anyBaseSubtraction(int b, int n1, int n2){
        int rv = 0;
        int c= 0;
        int p=1;
        while(n2>0){
            int d1 = n1 % 10;
            n1 = n1/10;
            int d2 = n2 % 10;
            n2 = n2/10;
            int d = 0;
            d2 = d2+c;
            if (d2>=d1){
                c= 0;
                d = d2 - d1;
            }else {
                c = -1;
                d = d2 + b - d1;
            }
            rv = rv+d*p;
            p = p*10;
        }
        return rv;
    }
    public static void main(String[] args) {

        int result =anyBaseSubtraction(8,256,1212);
        System.out.print(result);

    }
}
