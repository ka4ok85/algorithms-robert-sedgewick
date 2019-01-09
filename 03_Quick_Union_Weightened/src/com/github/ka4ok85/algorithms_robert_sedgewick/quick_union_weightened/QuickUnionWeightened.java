package com.github.ka4ok85.algorithms_robert_sedgewick.quick_union_weightened;

public class QuickUnionWeightened {
	private int[] tree;
	private int[] branchSize;

	public QuickUnionWeightened(int nodesCount) {
		tree = new int[nodesCount];
		branchSize = new int[nodesCount];
		for (int i = 0; i < tree.length; i++) {
			tree[i] = i;
			branchSize[i] = 1;
		}
	}

	public void union(int p, int q) {
		int pTopRoot = findRoot(p);
		int qTopRoot = findRoot(q);

		if (branchSize[pTopRoot] > branchSize[qTopRoot]) {
			tree[qTopRoot] = pTopRoot;
			branchSize[pTopRoot] = branchSize[pTopRoot] + branchSize[q]; 
		} else {
			tree[pTopRoot] = qTopRoot;
			branchSize[qTopRoot] = branchSize[qTopRoot] + branchSize[p];
		}
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
