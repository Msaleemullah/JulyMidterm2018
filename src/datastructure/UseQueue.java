package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> queue = new LinkedList<String>();
		queue.add("Pakistan");
		queue.add("Afghanistan");
		queue.add("India");
		queue.add("England");

       /* Iterator it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for (String st: queue) {
            System.out.println(st);

        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }*/
		System.out.println(queue.poll());
	}

}
