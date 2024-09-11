
//      Search elements by binary search

public class Program11 {

    static int binarySearch( int arr[], int n, int target ){

        int start = 0;
        int end = n-1;

        while(start <=end){

            int mid = (start+end)/2;
            
            if( target == arr[mid]){

                return mid;

            }else if( target > arr[mid]){

                start = mid+1;

            }else{
                end = mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int arr[] = { 2, 3, 4, 10, 40};

        int n = arr.length;

        int target = 10;

        System.out.println(binarySearch( arr, n, target ));
    }
}