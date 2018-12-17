package com.github.ka4ok85.algorithms_robert_sedgewick.quick_find;

public class Client {

	public static void main(String[] args) {

		int nodesCount = 10;
		QuickFind quickFind = new QuickFind(nodesCount); // 0 1 2 3 4 5 6 7 8 9

		quickFind.union(0, 5); // 0 1 2 3 4 0 6 7 8 9
		quickFind.union(5, 9); // 0 1 2 3 4 0 6 7 8 0
		quickFind.union(1, 4); // 0 1 2 3 1 0 6 7 8 9
		quickFind.union(0, 4); // 0 0 2 3 0 0 6 7 8 9

		System.out.println(quickFind.connected(0, 1)); // true
		System.out.println(quickFind.connected(0, 2)); // false
		System.out.println(quickFind.connected(0, 4)); // true
		System.out.println(quickFind.connected(0, 5)); // true
		System.out.println(quickFind.connected(0, 9)); // true
		System.out.println(quickFind.connected(1, 9)); // true
		System.out.println(quickFind.connected(2, 9)); // false
	}

}
