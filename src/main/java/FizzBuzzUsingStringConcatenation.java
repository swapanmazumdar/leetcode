import java.util.ArrayList;
import java.util.List;

public class FizzBuzzUsingStringConcatenation {

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String outputStr = "";
            if (i % 3 == 0) {
                outputStr += "Fizz";
            }
            if (i % 5 == 0) {
                outputStr += "Buzz";
            }
            if (outputStr.isEmpty()) {
                outputStr += (Integer.toString(i));
            }

            list.add(outputStr);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new FizzBuzzUsingStringConcatenation().fizzBuzz(3));
        System.out.println(new FizzBuzzUsingStringConcatenation().fizzBuzz(5));
        System.out.println(new FizzBuzzUsingStringConcatenation().fizzBuzz(15));
    }
}
