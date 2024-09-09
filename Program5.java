/*
 * Implement the following Function 

def differenceofSum(n. m)

The function accepts two integers n, m as arguments Find the sum of all numbers in range from 1 to
 m(both inclusive) that are not divisible by n. Return difference between sum of integers not divisible by 
 n with sum of numbers divisible by n.

Assumption:

n>0 and m>0
Sum lies between integral range
Example

Input
n:4
m:20
Output
90

Explanation

Sum of numbers divisible by 4 are 4 + 8 + 12 + 16 + 20 = 60
Sum of numbers not divisible by 4 are 1 +2 + 3 + 5 + 6 + 7 + 9 + 10 + 11 + 13 + 14 + 15 + 17 + 18 + 19 = 150
Difference 150 – 60 = 90
Sample Input
n:3
m:10
Sample Output
19
 */

 import java.util.*;

public class Program5 {
    
    static int differenceOfSum( int n, int m){

        int totalSum = (m+1)*m/2;

        System.out.println(totalSum);

        int sumDivisible = 0;

        int num = 1;

        int i = 1;

        while( num <= m){

            if( n != 1 && num == 1){

                num = n * i;
                i++;

                continue;
            }

            System.out.println(num);

            sumDivisible = sumDivisible + num;

            num = n * i;
            i++;
        }

    

        int sumNotDivisible = totalSum - sumDivisible;

        System.out.println(sumNotDivisible);

        return sumNotDivisible - sumDivisible;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter m");
        int m = sc.nextInt();

        System.out.println("Enter n");
        int n = sc.nextInt();

        System.out.println(differenceOfSum(n, m));

    }
}
