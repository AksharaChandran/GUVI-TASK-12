import java.util.ArrayList;
import java.util.List;

public class ListToArrayExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        String[] array = list.toArray(new String[0]);

        System.out.println("Array elements:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
