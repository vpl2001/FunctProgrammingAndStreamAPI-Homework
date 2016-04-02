import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created 31.3.2016 г..
 */
public class FilterArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> words = Arrays.asList(input.nextLine().split("[^\\p{L}]"));
        //thanks to the discussion in the forum

        words.stream().filter(w->w.length()>3)
                .map(w->w + " ")
                .forEach(System.out :: print);
    }
}
