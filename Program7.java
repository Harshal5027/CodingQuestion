/*
 * Implement the following Function

def ProductSmallestPair(sum, arr)

The function accepts an integers sum and an integer array arr of size n. Implement the function to find the
 pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two elements of array
(arr[j] + arr[k] <= sum) and return the product of element of this pair

NOTE

Return -1 if array is empty or if n<2
Return 0, if no such pairs found
All computed values lie within integer range
Example

Input

sum:9

size of Arr = 7

Arr:5 2 4 3 9 7 1

Output

2

Explanation

Pair of least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, output is 2

Sample Input

sum:4

size of Arr = 6

Arr:9 8 3 -7 3 9

Sample Output

-21
 */


public class Program7 {

    static int productOfSmallestPair( int arr[], int sum, int n){

        if( arr == null || n <= 2)
            return -1;

        int smallest = Integer.MAX_VALUE;

        int secondSmallest = Integer.MAX_VALUE;

        for( int i = 0; i < n; i++){

            if( arr[i] <= smallest){

                secondSmallest = smallest;
                smallest = arr[i];

            }

            if(arr[i] <= secondSmallest && arr[i] != smallest){

                secondSmallest = arr[i];

            }
        }

        if( smallest + secondSmallest <= sum ){

            return secondSmallest*smallest;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        
        int arr[] = { 9, 8, 8, -7, 3, 9};

        int n = arr.length;

        int sum = 4;

        System.out.println(productOfSmallestPair( arr, sum, n));
    }    
}
