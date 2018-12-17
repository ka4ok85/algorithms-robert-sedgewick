package com.github.ka4ok85.algorithms_robert_sedgewick.quick_find;

public class QuickFind {

	private int[] groups;

	public QuickFind(int nodesCount) {
		groups = new int[nodesCount];
		for (int i = 0; i < groups.length; i++) {
			groups[i] = i;
		}
	}

	public void union(int p, int q) {
		int pGroup = groups[p];
		int qGroup = groups[q];

		for (int i = 0; i < groups.length; i++) {
			if (groups[i] == qGroup) {
				groups[i] = pGroup;
			}

		}
	}

	public boolean connected(int p, int q) {
		return groups[p] == groups[q];
	}

}
