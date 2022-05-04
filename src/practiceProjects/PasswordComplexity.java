package practiceProjects;

import java.util.Scanner;

public class PasswordComplexity {
    //Must have atleast six characters
    //Must have one uppercase letter
    //Must have one lowercase letter
    //Must have one number
    //functions takes string as input and
    //out puts a boolean
    public static boolean isPasswordComplex(String password) {
        if (password.length() < 6){
            return false;
        }

        boolean hasLowercaseLetter = false;
        boolean hasUppercaseLetter = false;
        boolean hasNumber = false;

        for (int i = 0; i < password.length() ; i++){

            char character = password.charAt(i);

            if (Character.isUpperCase(character)){
                hasUppercaseLetter = true;
            }
            else if(Character.isLowerCase(character))
            {
                hasLowercaseLetter = true;
            }
            else if(Character.isDigit(character))
            {
                hasNumber = true;
            }
        } return hasUppercaseLetter && hasLowercaseLetter && hasNumber;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String password = input.nextLine();


        if (isPasswordComplex(password) == true){

            String results = "";
            for (int i = 0; i < password.length(); i++)
            {
                results += "*";
            }
            System.out.print(results);
            System.out.println("You entered a valid password of length, " + Integer.toString(password.length()));
        }else{
        System.out.println("Please enter a new password which is complex per the requirements. Thank you!");}
    }
}