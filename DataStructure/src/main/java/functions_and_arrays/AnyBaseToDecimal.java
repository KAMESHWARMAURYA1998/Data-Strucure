package functions_and_arrays;

public class AnyBaseToDecimal {

    /*
    * you are given a number n
    * you are given a base b, n is a number of base b
    * you are required to convert the number n into its corresponding value in decimal number system
    * */

    public static int anyBaseToDecimal(int digit, int b){
        int rv = 0;
        int p = 1;
        while(digit >0){
            int rem = digit % 10;
            digit = digit/10;
            rv = rv+p*rem;
            p = p *b;
        }
        return rv;
    }

    public static void main(String[] args) {
        int result = anyBaseToDecimal(1172,8);
        System.out.print(result);
    }
}
