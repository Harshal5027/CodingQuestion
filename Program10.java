
//     Prime Number

import java.util.*;

public class Program10 {

    static boolean checkPrimeNumber( int num ){

        int count = 0;

        for( int i = 1; i < Math.sqrt(num); i++){

            if( num % i == 0){
                count++;
            }
        }

        if(count == 1){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(checkPrimeNumber( num ));
        
    }
    
}
