public class Program13 {

    static void findOccurance( String str){

        for( int i = 0; i < str.length(); i++){

            int flag = 0;

            int count = 0;

            for( int j = 0; j < str.length(); j++){

                if( str.charAt(i) == str.charAt(j)){
                    count++;
                }
                if( j <= i){
                    
                    if( count > 1){

                        flag = 1;
                        break;

                    }

                }
            }

            if( flag == 0){
                System.out.println(str.charAt(i) + "  "+ count);
            }
        }
    }

    public static void main(String[] args) {
        

        String str = "aaccddeehghjyaaa";

        findOccurance( str );
    }
    
}
