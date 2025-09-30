import java.util.Scanner;

public class EANBarcodeCompleter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the barcode prefix");
        String barcodePrefix = scanner.nextLine();

        // Write your solution to Task 1 here
        boolean validPrefix = true;
        int temp = 0;
        if (barcodePrefix.length()==12){
            
            for (int i=0; i<12; i++){
                Character digit = barcodePrefix.charAt(i);
                if (Character.isDigit(barcodePrefix.charAt(i))){
                    if (i%2==0){
                        temp += Character.getNumericValue(digit); 
                    }else{
                        temp += Character.getNumericValue(digit)*4;
                    }
                }else{
                    validPrefix = false;
                }
            }           
        } else {
            validPrefix = false;
        }
        if (validPrefix){
                //System.out.println((10-temp%10)%10);
                System.out.println("Complete barcode: " + barcodePrefix + (10-temp%10)%10);
            }else{
                System.out.println("Invalid barcode prefix");
            }

        scanner.close();
    }
}

