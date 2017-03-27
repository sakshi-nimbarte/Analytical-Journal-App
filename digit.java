import java.util.Scanner;

public class digit {
  public static boolean containsOnlyNumbers(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (!Character.isDigit(str.charAt(i)))
        return false;
    }
    return true;
  }

  public static void main(String[] args) {

    Scanner user_input = new Scanner(System.in);
    String input_num;
    System.out.println("enter the string\t");
    input_num = user_input.next();

    System.out.println(containsOnlyNumbers(input_num));
  }
}
