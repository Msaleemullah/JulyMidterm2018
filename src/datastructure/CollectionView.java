package datastructure;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class     CollectionView {

        public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
                HashMap<Integer, String> map = new HashMap<Integer, String>();
                map.put(1, "NYC");
                map.put(2, "LA");
                map.put(3, "Denver");
                map.put(4, "Boston");
                map.put(5, "San Jose");
                map.put(6, "Seattle");

            // get value of three of key 3
                String city = (String)map.get(2);
                System.out.println("Value of three is: " + city);


        }

}