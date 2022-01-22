import java.util.ArrayList;
import java.util.Collections;

public class operationsOnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add elements
        list.add(0);
        list.add(3);
        list.add(5);
        System.out.println(list);

        // get elements - will pass index
        list.get(1);
        System.out.println(list.get(1));

        // add elements in between
        list.add(1, 7);
        System.out.println(list);

        // set element
        list.set(1, 8);
        System.out.println(list);

        // remove element
        list.remove(3);
        System.out.println(list);

        // size of ArrayList
        list.size();
        System.out.println(list.size());

        // loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // sorting
        Collections.sort(list);
        System.out.println(list);
    }

}
