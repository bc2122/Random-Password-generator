import java.util.*

class OTP_generator{

	static char[] OTP_generator(int pas){

        System.out.println("Generating OTP...");
        System.out.print("The OTP is: ");

        String num= "1234567890";
        Random rndm= new Random();
        char[] OTP= new char[pas];
        for(int i=0; i<pas; i++){
            OTP[i]= num.charAt(rndm.nextInt(num.length())); //Randomly picks number from the 'num' string
        }

        return OTP;

    }

    public static void main(String[] args){

        int password= 6;
        System.out.println(OTP_generator(password));
    }
}
	