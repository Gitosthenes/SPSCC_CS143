//Alex Bledsoe, 05/30/2017

import java.util.*;

public class MapTest {

    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(7, "Marty");
        map.put(34, "Louann");
        map.put(27, "Donald");
        map.put(15, "Moshe");
        map.put(84, "Larry");
        map.put(7, "Ed");
        map.put(2350, "Orlando");
        map.remove(8);
        map.put(5, "Moshe");
        map.remove(84);
        map.put(17, "Steve");
        System.out.println(map);

    }
}

