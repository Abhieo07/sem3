package tutorial1;

public class Enum {
    public static void main(String[] args) {
        Level lvl = Level.LOW;
        Level[] arr = Level.values();
        System.out.println(lvl.getlvl());
        System.out.println(Level.valueOf("LOW"));
        lvl.setlvl(5);
        System.out.println(lvl.getlvl());

        for(Level e : arr) {
            System.out.println(e);
        }

        if(lvl == Level.LOW) {
            System.out.println(lvl);
        } else if(lvl == Level.MEDIUM) {
            System.out.println(lvl);
        }else {
            System.out.println(lvl);
        }
    }
}
