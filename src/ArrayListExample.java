
    import java.util.ArrayList;

    public class ArrayListExample {
        public static void main(String[] args) {
            ArrayList<String> stringList = new ArrayList<>();
            stringList.add("First");
            stringList.add("Second");
            stringList.add("Third");

            System.out.println("ArrayList before clearing: " + stringList);

            stringList.clear();

            System.out.println("ArrayList after clearing: " + stringList);
        }
    }


