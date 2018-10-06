package com.nigel.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lists = new ArrayList<String>();
		lists.add("A");
		lists.add("B");
		lists.add("C");
		lists.add("D");
		lists.add("E");
		lists.add("F");
		lists.add("G");
		Iterator<String> iter = lists.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			if("B".equals(str)) {
				iter.remove();
			}else {
			System.out.println(str);
			}
		}
	}

}
