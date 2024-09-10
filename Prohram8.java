public class Prohram8 {

    public static void main(String[] args) {
        
        int num = 54321;

        int temp = 0;

        while( num > 0){

                temp = (temp*10)+ num%10;

                num = num/10;
        }

        System.out.println(temp);
    }
    
}
