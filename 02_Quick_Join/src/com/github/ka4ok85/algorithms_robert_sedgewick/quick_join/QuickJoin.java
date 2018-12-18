package com.github.ka4ok85.algorithms_robert_sedgewick.quick_join;

public class QuickJoin {

	private int[] tree;

	public QuickJoin(int nodesCount) {
		tree = new int[nodesCount];
		for (int i = 0; i < tree.length; i++) {
			tree[i] = i;
		}
	}

	public void union(int p, int q) {
		int pTopRoot = findRoot(p);
		int qTopRoot = findRoot(q);
		
		tree[pTopRoot] = qTopRoot;
	}

	public boolean connected(int p, int q) {
		return findRoot(p) == findRoot(q);
	}
	
	private int findRoot(int p) {
		while (p != tree[p]) {
			p = tree[p];
		}
		
		return p;
	}

}
