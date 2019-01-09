### Data Structure
Array size on N nodes. Value in the array holds a reference to the closest root Node. Initially tree is completely flat.
Additional data structure is array size on N that represents number on nodes in this subtree (node itself + all it's childs).

### Initialization
N

### Union
Top level root of Q Node becomes a child of top level root of P Node.
Smaller tree always becomes a child of bigger tree. Keep in mind we use number of nodes as size but not a length of the route to the top. This approach guarantees that our trees are rather flat than tall.

Only single value is changed but we obligated to find top roots for both P and Q Nodes. Since trees are weightened finding top root element costs lgN operations.

### Connected
Check if P and Q Node have the same top root. Complexity is lgN because trees are weightened.

### Summary Complexity
Initialization: N
Union: lgN
Connected: lgN
