import java.util.*;

class Solution {
    public long maximumImportance(int n, int[][] arr) {
        // Create adjacency list
        List<Integer>[] adjList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<>();
        }

        // Fill adjacency list
        for (int i = 0; i < arr.length; i++) {
            adjList[arr[i][0]].add(arr[i][1]);
            adjList[arr[i][1]].add(arr[i][0]);
        }

        // Calculate the number of neighbors for each node
        int[] neighbourCount = new int[n];
        for (int i = 0; i < n; i++) {
            neighbourCount[i] = adjList[i].size();
        }

        // Create an array of indices to represent nodes
        Integer[] nodes = new Integer[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = i;
        }

        // Sort the nodes based on the number of neighbors using efficient sort
        Arrays.sort(nodes, (a, b) -> neighbourCount[b] - neighbourCount[a]);

        // Assign importance values from n to 1
        int[] importanceValues = new int[n];
        int importance = n;
        for (int i = 0; i < n; i++) {
            importanceValues[nodes[i]] = importance--;
        }

        // Calculate the total importance
        long ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += importanceValues[arr[i][0]] + importanceValues[arr[i][1]];
        }

        return ans;
    }
}
