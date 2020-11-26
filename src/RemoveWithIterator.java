import java.util.*;

public class RemoveWithIterator {
    public static void main(String[] args) {
        String[] array = {"Cat", "Dog", "Mouse", "Pig", "Cow", "Bull"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        try {
            for (String s : list) {
                if (s.length() != 3) {
                    list.remove(s);
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("You can't remove items from List during iterarion");
        }
        // but you can use Iteraror
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = (String) iterator.next();
            if (item.length() != 3) {
                iterator.remove();
            }
        }
        System.out.println(list);

    }
}
