import java.util.*;

public class Exercise_27_LambdaExpressions {

    public static void main(String[] args) {

        List<String> names =
                new ArrayList<>();

        names.add("John");
        names.add("Alice");
        names.add("David");
        names.add("Bob");

        Collections.sort(
                names,
                (a,b) -> a.compareTo(b));

        System.out.println(names);
    }
}