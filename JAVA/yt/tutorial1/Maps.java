package tutorial1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Maps {
    public static void main(String[] args) {
//-------------------HASH MAP-------------------
        Map m = new HashMap();

        // m.put("abhi",19);
        // m.put("aman", "rifat");
        // m.put(11,999);
        char ch = 'A';
        for(int i = 0; i < 5; i++) {
            m.put(ch,i);
            ch++;
        }

                           

        System.out.println(m);
//-------------------TREE MAP ------------------
        // Map t = new TreeMap();
        // t.put("abhi",19);
        // t.put("aman", "rifat");
        // t.put("a", "b");

        // System.out.println(t);
//--------------------LINKED HASH MAP----------------
        // Map l = new LinkedHashMap();
        // l.put("abhi",19);
        // l.put("aman", "rifat");
        // l.put("a", "b");

        // System.out.println(l);

    }
}
