/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     ArrayList<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    /**
     * @param node: A undirected graph node
     * @return: A undirected graph node
     */
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        // write your code here
        if (node == null) {
            return null;
        }
        
        ArrayList<UndirectedGraphNode> nodes = new ArrayList<UndirectedGraphNode>();
        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>(); 
        nodes.add(node);
        map.put(node, new UndirectedGraphNode(node.label));
        // int num = 0;// num of current nodes
        // clone nodes into hashmap
       
        for (int i = 0; i < nodes.size(); i++) {
            UndirectedGraphNode head = nodes.get(i);
            for (int j = 0; j < head.neighbors.size(); j++) {
                if (!map.containsKey(head.neighbors.get(j))) {
                    nodes.add(head.neighbors.get(j));
                    map.put(head.neighbors.get(j), new UndirectedGraphNode(head.neighbors.get(j).label));
                }
            }
        }
        
        // clone neighbors
        for (int x = 0; x < nodes.size(); x++) {
            ArrayList<UndirectedGraphNode> Allneighbors = nodes.get(x).neighbors;
            // ArrayList<UndirectedGraphNode> cloneNeighbors = new ArrayList<UndirectedGraphNode>(); 
            for (int y = 0; y < Allneighbors.size(); y++) {
                // debug place 
                // map.get(nodes.get(x)).neighbors.add(Allneighbors.get(y));
                map.get(nodes.get(x)).neighbors.add(map.get(nodes.get(x).neighbors.get(y)));
            }
            
        }
        
        return map.get(node);
            
        
        
        
    }
}
