import java.util.Scanner;

public class alpha {
  public static boolean isAlpha(String str) {
      char[] chars = str.toCharArray();

      for (char c : chars) {
          if(!Character.isLetter(c)) {
              return false;
          }
      }

      return true;
  }

  public static void main(String[] args) {

    Scanner user_input = new Scanner(System.in);
    String input_alpha;
    System.out.println("enter the string\t");
    input_alpha = user_input.next();

    System.out.println(isAlpha(input_alpha));
  }
}
