package Collection;
import java.util.*;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionMap {
    public static void main(String[] args){
        System.out.println(fill(new ArrayList<>()));
        System.out.println(fill(new LinkedList<>()));
        System.out.println(fill(new HashSet()));
        System.out.println(fill(new TreeSet<>()));
        System.out.println(fill(new HashMap<>()));
        System.out.println(fill(new TreeMap<>()));
    }

    static Collection fill(Collection c){
        c.add(new Integer(1));
        c.add(1);
        c.add(2);
        c.add(3);
        return c;
    }

    static Map fill(Map m){
        m.put("1","One");
        m.put("1","First");
        m.put("3","Third");
        m.put("2","Second");
        return m;
    }

}
