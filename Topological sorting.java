/**
 * Definition for Directed graph.
 * class DirectedGraphNode {
 *     int label;
 *     ArrayList<DirectedGraphNode> neighbors;
 *     DirectedGraphNode(int x) { label = x; neighbors = new ArrayList<DirectedGraphNode>(); }
 * };
 */
public class Solution {
    /**
     * @param graph: A list of Directed graph node
     * @return: Any topological order for the given graph.
     */    
    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
        // write your code here
        // using BFS hashmap store all neighbors.
        ArrayList<DirectedGraphNode> result = new ArrayList<DirectedGraphNode>();
        HashMap<DirectedGraphNode, Integer> map = new HashMap<DirectedGraphNode, Integer>();
        
        for (DirectedGraphNode node : graph) {
            for (DirectedGraphNode neighbor : node.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, 1);
                } else {
                    map.put(neighbor, map.get(neighbor) + 1);
                }
            }
        } 
        Queue<DirectedGraphNode> q = new LinkedList<DirectedGraphNode>();
        for (DirectedGraphNode node : graph) {
            if (!map.containsKey(node)) {
                q.offer(node);
                result.add(node);
            }
        }
        
        while(!q.isEmpty()) {
            DirectedGraphNode level = q.poll();
            for(DirectedGraphNode n : level.neighbors) {
                map.put(n, map.get(n) - 1);
                if (map.get(n) == 0) {
                    q.offer(n);
                    result.add(n);
                }
            }
        }
        return result;
    }
}
