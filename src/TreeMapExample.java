import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> employeeMap = new TreeMap<>();
        employeeMap.put(123, "John Doe");
        employeeMap.put(124, "Alice Smith");
        employeeMap.put(125, "Bob Johnson");

        System.out.println("Employee names in alphabetical order:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
