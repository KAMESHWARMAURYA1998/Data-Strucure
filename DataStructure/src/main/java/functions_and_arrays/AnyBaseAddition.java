package functions_and_arrays;

public class AnyBaseAddition {

    /*
    * you are given base b
    * you are given two number n1 and n2 of base b
    * you are required to add two numbers and print their in base b
    * */


    public static int anyBaseAddition(int b, int n1, int n2){
        int rv = 0;
        int c =0;
        int p=1;
        while(n1>0 || n2>0 || c>0){
            int d1 = n1%10;
            int d2 = n2%10;
            n1 = n1/10;
            n2 = n2/10;
            int d = d1+d2+c;
            c = d/b;
            d = d%b;
            rv = rv+ d*p;
            p = p*10;
        }
        return rv;
    }
    public static void main(String[] args) {

        int result = anyBaseAddition(8,236,754);
        System.out.print(result);


    }
}
