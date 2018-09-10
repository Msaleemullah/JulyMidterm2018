package datastructure;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.set(1, 30);

		System.out.println(list.get(1));

	}

}
