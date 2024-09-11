
//  Find the subarray

public class Program9 {

    static void subArray( int arr[], int n){

        int sum = 0;

        int startIndex = -1;

        int endIndex = -1;

        int x = -1;

        int maxSum = Integer.MIN_VALUE;

        for( int i = 0; i < n; i++){
            
            if( sum == 0){

                x = i;
                
            }

            sum = sum + arr[i];

            if( maxSum < sum){
                maxSum = sum;

                startIndex = x;

                endIndex = i;
            }

            if( sum < 0){
                sum = 0;
            }
        }

        System.out.println("Indexes Are : "+ startIndex +" and "+ endIndex+"\n Max sum is : "+ maxSum);
    }
    
    public static void main(String[] args) {
        
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4};

        int n = arr.length;

        subArray(arr, n);
    }
}
