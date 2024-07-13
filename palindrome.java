import java.util.Locale;

public class palindrome {



    public static void main(String[] args) {
        String pal="010";
        System.out.println(pali(pal));

    }
    public static boolean pali(String pal){
        pal=pal.toLowerCase();
        for (int i = 0; i <=pal.length()/2; i++) {
            int start=pal.charAt(i);
            int end =pal.charAt(pal.length()-i-1);

            if(start!=end){
                return false;

            }

        }
        return true;
    }
}
