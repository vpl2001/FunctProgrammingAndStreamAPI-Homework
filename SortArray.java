import java.util.Arrays;
import java.util.Scanner;

/**
 * Created 31.3.2016 г..
 */
public class SortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]inputStr = input.nextLine().split(" ");
        Integer[]numbers = new Integer[inputStr.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=Integer.parseInt(inputStr[i]);
        }
        String order = input.nextLine();
        if (order.equals("Ascending")){
            Arrays.stream(numbers).sorted((n1, n2)->n1.compareTo(n2))
                    .forEach(n-> System.out.print(n + " "));
        } else {
            Arrays.stream(numbers).sorted((n1,n2)->n2.compareTo(n1))
                    .forEach(n-> System.out.print(n + " "));
        }
    }
}
