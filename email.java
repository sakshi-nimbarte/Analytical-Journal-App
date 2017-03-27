
/* This program checks whether entered email is correct by checking whether the email string ends with
    @gmail.com, @hotmail.com, @yahoo.com, @coep.ac.in, @icloud.com, @rediffmail.com
*/


import java.util.Scanner;

public class email {
  public static boolean checkEmail(String str) {

    boolean retVal;

    retVal = str.endsWith( "@gmail.com" ) || str.endsWith( "@hotmail.com" ) || str.endsWith( "@yahoo.com" ) || str.endsWith( "@coep.ac.in" ) || str.endsWith( "@icloud.com" ) || str.endsWith( "@rediffmail.com" );
    //System.out.println("Returned Value = " + retVal );

    return retVal;

 }


  public static void main(String[] args) {

    Scanner user_input = new Scanner(System.in);
    String input_email;
    System.out.println("enter the email\t");
    input_email = user_input.next();

    System.out.println(checkEmail(input_email));
  }

}
