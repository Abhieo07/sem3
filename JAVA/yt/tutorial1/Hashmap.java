package tutorial1;
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        Map m = new HashMap();
        String str = "Hello my name is Abhi and i am cool";

        for(char x:str.toCharArray()) {
            if(m.containsKey(x)){
                int old = (int) m.get(x);
                m.put(x,old+1);
            }
            else {
                m.put(x, 1);
            }
        }
        m.remove(' ');
        System.out.println(m);

//------------------SORTING--------------------
        // int[] x = {-2,3,1,5,65,4,9,25};
        // Arrays.sort(x,1,3);
        // for(int i:x) {
        //     System.out.print(i + ",");
        // }

    }
}
