import java.util.Scanner;
import java.util.ArrayList;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */

    Scanner in = new Scanner(System.in);

    int integer = in.nextInt();

    for (int i = integer; i > 0; i--){
      String result = "*".repeat(i);
      System.out.println(result);
    }

    in.close();
  }
}
