package com.nigel.List;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = null;
		s = new TreeSet<String>();
		s.add("A");
		s.add("C");
		s.add("B");
		
		s.add("D");
		System.out.println(s);
	}

}
