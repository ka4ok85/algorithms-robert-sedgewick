### Data Structure
Array size on N nodes. Value in the array represents a Nodes Group named by a first Node of this Group. Initially values are equal to the Node's index. Nodes with the same value are connected.

### Initialization
N

### Union
We check every Node to see if it belongs to Q Group and if yes we assign to this Node P value. Otherwise ignore it. 
Quite expensive because for every union operation we touch every Node, e.g. complexity is N.
This is an issue since usually number of union operations at least equals to number of Nodes. In this case total complexity is N nodes * M unions. It's fair to say this is o(n2).

### Connected
Constant time.

### Summary Complexity
Initialization: N
Union: N
Connected: 1
