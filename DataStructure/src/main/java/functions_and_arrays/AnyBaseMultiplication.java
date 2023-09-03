package functions_and_arrays;

/*
* you are given a base b
* you are given two numbers n1 and n2 of base b
* you are required to multiply n1 and n2 and print the value
* */


public class AnyBaseMultiplication {

    public static int getSum(int b, int n1, int n2){
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

    public static int singleDigitProduct(int b, int n1, int d2){
        int rv=0;
        int c = 0;
        int p =1;
        while (n1>0){
            int d1 = n1%10;
            n1 = n1/10;
            int d = d1*d2+c;
            c = d/b;
            d = d%10;
            rv = rv+d*p;
            p = p*10;
        }
        return rv;
    }

    public static int  multiplication(int b, int n1, int n2){
        int rv =0;
        int p=1;
        while (n2>0){
            int d = n2%10;
            n2 = n2/10;
            int sdrp = singleDigitProduct(b,n1,d);
            rv = getSum(b,rv,sdrp*p);
            p = p*10;
        }
        return rv;
    }
    public static void main(String[] args) {
        int result = multiplication(8,76,56);
        System.out.print(result);

    }
}
