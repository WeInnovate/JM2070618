package hello;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		System.out.println(list);
		list.remove("Banana");
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}

}
