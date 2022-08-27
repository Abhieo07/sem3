package tutorial1;
import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> t = new HashSet<Integer>();
        t.add(5);
        t.add(7);
        t.add(9);
        t.add(5);

        System.out.println(t);
    }
}
