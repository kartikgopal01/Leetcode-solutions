class Solution { 
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Graph adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        // In-degree of each course
        int[] inDegree = new int[numCourses];

        // Initialize the graph
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        // Build the graph and fill in-degree array
        for (int[] prereq : prerequisites) {
            int course = prereq[0];
            int dependency = prereq[1];
            graph.get(dependency).add(course);
            inDegree[course]++;
        }

        // Queue for courses with no prerequisites
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) queue.offer(i);
        }

        int finishedCourses = 0;

        // Topological sort (BFS)
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            finishedCourses++;

            for (int neighbor : graph.get(curr)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) queue.offer(neighbor);
            }
        }

        // If we've visited all courses, we can finish them
        return finishedCourses == numCourses;
    }
}
