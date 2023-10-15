//1. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst = new ArrayList<>();
		
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(7);
		
		Collections.shuffle(lst);
		
		Integer[] a = lst.toArray(new Integer[0]);
		
		for(int i : a) {
			System.out.print(i + " ");
		}

	}

}
