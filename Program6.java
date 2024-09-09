/*
 * You are required to implement the following Function 

def LargeSmallSum(arr)

The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum 
of second largest  element from the even positions and second smallest from the odd position of given ‘arr’

Assumption:

All array elements are unique
Treat the 0th position as even
NOTE

Return 0 if array is empty
Return 0, if array length is 3 or less than 3
Example

Input

arr:3 2 1 7 5 4

Output

7

Explanation

Second largest among even position elements(1 3 5) is 3
Second smallest among odd position element is 4
Thus output is 3+4 = 7
Sample Input

arr:1 8 0 2 3 5 6

Sample Output

8
 */

 import java.util.*;

public class Program6 {

    static int largesmallSum( int arr[], int n){

        int evenSecondLargest = Integer.MIN_VALUE;
        int evenLargest = Integer.MIN_VALUE;

        int oddSecondSmallest = Integer.MAX_VALUE;
        int oddSmallest = Integer.MAX_VALUE;

        for( int i = 0; i < n; i++){

            if( i % 2 == 0){
                

                if( arr[i] >= evenLargest){

                    evenSecondLargest = evenLargest;
                    evenLargest = arr[i];
                }

                if(arr[i] >= evenSecondLargest && arr[i] != evenLargest){

                    evenSecondLargest = arr[i];
                }
            }else{

                if( arr[i] <= oddSmallest){

                    oddSecondSmallest = oddSmallest;
                    oddSmallest = arr[i];
                }

                if( arr[i] <= oddSecondSmallest && arr[i] != oddSmallest){

                    oddSecondSmallest = arr[i];
                }

            }
        }

        return evenSecondLargest + oddSecondSmallest;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for( int i = 0; i < n; i++){

            arr[i] = sc.nextInt();

        }

        System.out.println(largesmallSum( arr, n));
    }
}
