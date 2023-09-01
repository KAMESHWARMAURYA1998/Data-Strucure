package functions_and_arrays;
/*
count frequency for given number in digit
example :
      input : 7654757
        number : 7
        output : 3
        */

public class CountFrequencyOfDigit {
    public static void main(String[] args) {
        int dig  = 7654757;
        int count = 0;
        int d=5;
        while(dig>0){
            int n = dig%10;
           dig = dig/10;
           if (n==d){
              count++;
           }
        }
        System.out.print(count);
    }
}
