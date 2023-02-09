package com.pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

class User {

	String userName;
	String firstName;
	String lastName;
	String address;

	User(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {

		return userName;
	}

}

public class CollectionFrameworkEx {
	public static void main(String[] args) {

		User user = new User("sairam");
		User user1 = new User("sairam123");

		List<User> list4 = new ArrayList<>();

		list4.add(user);
		list4.add(user1);

		for (User li3 : list4) {
			System.out.println(li3.toString());
		}

		List list = new ArrayList();
		list.add(1);
		list.add(1.234);
		list.add("sairam");
		list.add('M');
		list.add(true);

		System.out.println(list);

		list.add(0, 123);

		System.out.println(list);

		List list2 = new ArrayList();
		list.add(1);
		list.add(1.234);

		list.addAll(list2);
		System.out.println(list);

		// list.clear();

		System.out.println(list.contains("nikhil"));

		System.out.println(list.get(0));

		System.out.println(list.indexOf(20));

		System.out.println(list.isEmpty());

		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.size());

		System.out.println(list.toString());

		List subList = list.subList(0, 2);
		System.out.println(subList);

		for (Object obj : subList) {
			System.out.println(obj);
		}

		List<Integer> list3 = new ArrayList<>();

		list3.add(1);
		list3.add(2);

		for (int i = 0; i < list3.size(); i++) {
			System.out.println("NOrmal Loop " + list3.get(i));
		}

		System.out.println("###################");

		list3.forEach(x -> {

			System.out.println("Java 8 for Each" + x);
		});

		System.out.println(list3);

		Iterator<Integer> iterator = list3.iterator();

		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();

			// iterator.remove();

			System.out.println("########### Iterator " + integer);

		}

		ListIterator<Integer> listIterator = list3.listIterator();

		while (listIterator.hasNext()) {
			Integer integer = (Integer) listIterator.next();
			System.out.println("#####List Iterator " + integer);

		}

		while (listIterator.hasPrevious()) {
			Integer integer = (Integer) listIterator.previous();
			System.out.println("#############Previous Interator" + integer);
		}

		Collections.reverse(list3);
		System.out.println(list3);

		Set s = new HashSet(2);

		s.add(4);
		s.add(8);
		s.add(8);

		System.out.println("HashCode " + s.hashCode());
		System.out.println(s.size());
		System.out.println(s);

		System.out.println("################### LinkedHashSet #############");

		Set s1 = new LinkedHashSet();

		s1.add(10);
		s1.add(11);
		s1.add(10);
		System.out.println(s1);

		Vector v = new Vector();

		// how HashMap internally works ?
		Map map = new HashMap();

		map.put("1", "sairam");
		map.put("2", "test");
		map.put(null, null);
		map.put("2", "sairam");
		map.put(null, null);
		System.out.println(map);

		System.out.println(map);

		System.out.println(map);

		System.out.println(map.get("1"));

		System.out.println(map.size());

		System.out.println(map.values());

		System.out.println(map.keySet());

		map.forEach((x, y) -> {
			System.out.println(x + " " + y);
		});
		
		

		System.out.println(map.containsKey("1"));

		String smap = "sairam";

		Map<String, Integer> countMap = new HashMap<>();
		for (int i = 0; i < smap.length(); i++) {
			String charAt = smap.charAt(i) + "";

			if (countMap.containsKey(charAt)) {
				countMap.put(charAt, countMap.get(charAt) + 1);
			} else {
				countMap.put(charAt, 1);
			}

		}

		System.out.println(countMap);

		Map map1 = new LinkedHashMap();
		map1.put("2", "sairam");
		map1.put("1", "test");

		System.out.println(map1);

		Hashtable hashTable = new Hashtable();

		hashTable.put("2", "sairam");
		hashTable.put("1", "test");

		Enumeration elements = hashTable.elements();

		while (elements.hasMoreElements()) {

			Object object = (Object) elements.nextElement();
			System.out.println("Enumeration " + object);

		}
		//

		TreeSet st = new TreeSet();

		st.add(1);
		st.add(10);
		st.add(0);
		st.add(0);
		System.out.println(st.ceiling(2));

		System.out.println(st);

		TreeMap<String, String> mapst = new TreeMap<String, String>();

		mapst.put("ter", "ert");
		mapst.put("sai", "ert");
		System.out.println(mapst.firstKey());
		System.out.println(mapst);

		Stack stk = new Stack();

		stk.push(4);
		stk.push(2);
		stk.push(3);

		stk.add(5);

		System.out.println(stk.peek());
		System.out.println(stk.pop());

		System.out.println(stk.search(2));
		Collections.sort(stk);
		System.out.println(stk);
		System.out.println(stk.get(0));

		PriorityQueue que = new PriorityQueue();
		que.add(7);
		que.add(8);
		que.add(9);
		que.offer(89);

		System.out.println(que);
		System.out.println(que.element());
		System.out.println(que.peek());
		System.out.println(que.poll());

		System.out.println(que);
		System.out.println(que.remove());

		System.out.println(que);
		
		
		

	}

}
