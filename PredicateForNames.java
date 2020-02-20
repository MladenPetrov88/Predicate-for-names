import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int namesLength = Integer.parseInt(scanner.nextLine());

        Predicate<String> isNameLengthLTE = w -> w.length()<=namesLength;

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        names.stream()
                .filter(isNameLengthLTE)
                .forEach(e -> System.out.println(e));
    }
}
