import java.util.*;

public class LLByCollectionFramwWork {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        // add
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("This");
        list.addLast("list");
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "->");
        }
        System.out.println("Null");

        // for deleting
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

    }

}
