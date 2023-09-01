package functions_and_arrays;

/*
* you are given a decimal number n
* you are given base b
* you are required to convert the number n into ints corresponding value base b
* */
public class DecimalToAnyBase {

    public static int decimalToAnyBase(int digit, int b){
        int rv = 0;
        int p = 1; // smallest power of 10 -> 10^0=1
        while(digit>0){
            int rem = digit % b;
            digit = digit/b;
            rv = rv+p*rem;
            p = p*10;
        }
return rv;
    }

    public static void main(String[] args) {
        int result = decimalToAnyBase(634,8);
        System.out.print(result);
    }
}
