package com.github.ka4ok85.algorithms_robert_sedgewick.quick_join;

public class Client {

	public static void main(String[] args) {
		int nodesCount = 10;
		QuickJoin quickJoin = new QuickJoin(nodesCount); // 0 1 2 3 4 5 6 7 8 9

		quickJoin.union(0, 5); // 5 1 2 3 4 5 6 7 8 9
		quickJoin.union(5, 9); // 5 1 2 3 4 9 6 7 8 9
		quickJoin.union(1, 4); // 5 4 2 3 4 9 6 7 8 9
		quickJoin.union(0, 4); // 5 4 2 3 4 9 6 7 8 4
		
/*
Elements Tree:
		2 3 4 6 7 8
           _|_
          1   9
              |
              5
              |
              0
*/

		System.out.println(quickJoin.connected(0, 1)); // true
		System.out.println(quickJoin.connected(0, 2)); // false
		System.out.println(quickJoin.connected(0, 4)); // true
		System.out.println(quickJoin.connected(0, 5)); // true
		System.out.println(quickJoin.connected(0, 9)); // true
		System.out.println(quickJoin.connected(1, 9)); // true
		System.out.println(quickJoin.connected(2, 9)); // false
	}
}
