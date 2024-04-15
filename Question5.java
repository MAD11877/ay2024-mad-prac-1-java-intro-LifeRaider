import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Scanner in = new Scanner(System.in);

    ArrayList<Integer> numbers = new ArrayList<>();

    int integer = in.nextInt();

    for (int i = integer; i > 0; i--){
      int num = in.nextInt();
      numbers.add(num);
    }

    int fmode = 0;
    int fmax = 0;

    for (int i : numbers){
      int count= 0;
      for (int j : numbers){
        if (i == j){
          count++;
        }
      }
      if (count > fmax){
        fmax = count;
        fmode = i;
      }
    }

    System.out.print(fmode);

    in.close();
  }
}
