package functions_and_arrays;

public class AnyBaseToAnyBase {

    /*
    * you are given a number n
    * you are given a base b1. n is a number on base b
    * you are given another base b2
    * you are required to convert the number n of base b1 to a number in base b2
    * */

    public static int anyBaseToAny(int number, int b1, int b2){
      int dec = anyBaseToDecimal(number,b1);
      int res = decimalToAnyBase(dec,b2);
      return res;
    }

    public static int decimalToAnyBase(int number, int b){
        int rv = 0;
        int p=1;
        while (number>0){
            int rem = number%b;
            number = number/b;
            rv = rv+rem*p;
            p = p*10;
        }
        return rv;
    }
    public static int anyBaseToDecimal(int number, int b){
        int rv = 0;
        int p=1;
        while (number>0){
            int rem = number % 10;
            number = number/10;
            rv = rv+ rem*p;
            p = p*b;
        }
        return rv;
    }
    public static void main(String[] args) {

       int result =  anyBaseToAny(172,8,2);
       System.out.print(result);

    }
}
