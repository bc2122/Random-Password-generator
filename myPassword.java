import java.util.Random;

public class myPassword {

    static char[] myPassword(int length){

        System.out.println("Generating password......");
        System.out.println("Your new password is: ");
        String alphabets_upper= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabets_lower= "abcdefghijklmnopqrstuvwxyz";
        String numbers= "1234567890";
        String specialChar= "!@#$%^&*/?";
        String val= alphabets_lower+ alphabets_upper+ numbers+ specialChar;
        Random rndm= new Random();
        char[] password= new char[length];
            for (int i=0; i<length; i++){
                password[i]= val.charAt(rndm.nextInt(val.length()));
            }

            return password;

    }

    public static void main(String[] args) {

        int password_length=10;
        System.out.println(myPassword(password_length));

    }

}
