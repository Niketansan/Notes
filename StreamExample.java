package com.pratice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class UserTest {

	String firstName;

	Address address;

}

class Address {

	String addres1;
	String addres2;
	String addres3;
	String postalCode;

}

public class StreamExample {
	public static void main(String[] args) {

		UserTest user = new UserTest();

		Address ad = new Address();

		List<Integer> list = new ArrayList<>();

		list.add(9);
		list.add(2);
		list.add(1);
		list.add(1);
		list.add(5);
		list.add(4);

		list.forEach(x -> {
			System.out.println(x);
		});

		System.out.println("##################################");
		list.parallelStream().forEach(x -> {
			System.out.println(x);
		});

		List l1 = null;

		Optional<List> ofNullable = Optional.ofNullable(l1);

		if (ofNullable.isPresent()) {

			List list2 = ofNullable.get();
			System.out.println(list2.size());
		}

		
		Integer reduce = list.stream().filter(x -> x % 2 == 0).reduce(0,(a,b)->a+b);
		
		
		System.out.println("#####################"+reduce);
		
		
		List<Integer> collect4 = list.stream().filter(x -> x % 2 == 0).skip(1).limit(1).collect(Collectors.toList());

		System.out.println(collect4);
		boolean test = true;

		Optional<Integer> findAny = list.stream().filter(x -> x % 2 == 0).max(Comparator.reverseOrder());

		if (findAny.isPresent()) {
			Integer va = findAny.get();
		}

		Optional<Integer> findAny1 = list.stream().filter(x -> x % 2 == 0).min(Comparator.reverseOrder());

		if (findAny1.isPresent()) {
			Integer va = findAny1.get();
		}

		Optional<Integer> findAny2 = list.stream().filter(x -> x % 2 == 0).findAny();

		if (findAny2.isPresent()) {
			Integer va = findAny2.get();
		}

		Optional<Integer> findAny3 = list.stream().filter(x -> x % 2 == 0).findFirst();

		if (findAny3.isPresent()) {
			Integer va = findAny3.get();
		}

		List<Integer> collect3 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println(collect3);

		List<Integer> list2 = collect3.stream().distinct().collect(Collectors.toList());

		System.out.println(list2);

		List<Integer> collect = collect3.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

		System.out.println(collect);

		List<Integer> collect2 = collect3.stream().filter(x -> x % 2 == 0).map(x -> x * 3).collect(Collectors.toList());

		System.out.println(collect2);

		int even = list.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

		System.out.println(even);

	}
}
