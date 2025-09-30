import java.math.BigInteger;
import java.util.Scanner;

public class IBANValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the IBAN");
        String ibanInput = scanner.nextLine().replaceAll("\\s", "");

        // Write your solution to Task 2 here
        boolean validIban = true;
        String movedString = "";
        String temp = "";
        for (int i = 0; i<ibanInput.length(); i++){
            Character ibanChar = ibanInput.charAt(i);
            if (!(Character.isDigit(ibanChar) || Character.isUpperCase(ibanChar))){
                validIban = false;
                System.out.println("False");
                break;
            }
        }
        if (validIban){
            movedString = ibanInput.substring(4, ibanInput.length()) + ibanInput.substring(0,4);
            for (int i=0; i<movedString.length(); i++){
                temp += Character.getNumericValue(movedString.charAt(i));
            }
            //System.out.println(movedString);
            //System.out.println(temp);
            BigInteger bigInt = new BigInteger (temp); 
            int modValue = bigInt.mod (BigInteger.valueOf (89)).intValue();
            if (modValue%89==1){
                System.out.println("Valid IBAN");
            }else{
                System.out.println("Invalid IBAN");
            }
        }else{
            System.out.println("Invalid IBAN");
        }
        scanner.close();
    }

}
