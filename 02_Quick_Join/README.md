### Data Structure
Array size on N nodes. Value in the array holds a reference to the closest root Node. Initially tree is completely flat.

### Initialization
N

### Union
Top level root of Q Node becomes a child of top level root of P Node.

Only single value is changed but we obligated to find top roots for both P and Q Nodes. This could be quite expensive (almost N in worst case).

### Connected
Check if P and Q Node have the same top root. Complexity can be N in worst case.

### Summary Complexity
Initialization: N
Union: N*
Connected: N*
