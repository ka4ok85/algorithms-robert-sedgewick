package com.github.ka4ok85.algorithms_robert_sedgewick.quick_union_weightened;

import com.github.ka4ok85.algorithms_robert_sedgewick.quick_union_weightened.QuickUnionWeightened;

public class Client {

	public static void main(String[] args) {
		int nodesCount = 10;
		QuickUnionWeightened quickUnionWeightened = new QuickUnionWeightened(nodesCount); // 0 1 2 3 4 5 6 7 8 9

		quickUnionWeightened.union(0, 5); // 5 1 2 3 4 5 6 7 8 9
		quickUnionWeightened.union(5, 9); // 5 1 2 3 4 5 6 7 8 5
		quickUnionWeightened.union(1, 4); // 5 4 2 3 4 5 6 7 8 5
		quickUnionWeightened.union(0, 4); // 5 4 2 3 5 5 6 7 8 5

/*
Elements Tree:
		2 3 5 6 7 8
           _|_
          0 9 4
              |
              1

*/

		System.out.println(quickUnionWeightened.connected(0, 1)); // true
		System.out.println(quickUnionWeightened.connected(0, 2)); // false
		System.out.println(quickUnionWeightened.connected(0, 4)); // true
		System.out.println(quickUnionWeightened.connected(0, 5)); // true
		System.out.println(quickUnionWeightened.connected(0, 9)); // true
		System.out.println(quickUnionWeightened.connected(1, 9)); // true
		System.out.println(quickUnionWeightened.connected(2, 9)); // false
	}

}
