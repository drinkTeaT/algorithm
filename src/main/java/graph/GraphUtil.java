package graph;

import java.util.Stack;

/**
 * Description 图的搜索算法
 * Author liuweibin
 * Date 2019/12/26 15:10
 **/
public class GraphUtil {
    /**
     * 深度优先搜索算法
     *
     * @param graph
     */
    public static void dfs(Graph graph) {
        Stack<Integer> theStack = new Stack<>();
        graph.getVertexArray()[0].setWasVisited(true);
        graph.displayVertex(0);
        theStack.push(0);

        while (!theStack.isEmpty()) {
            int v = graph.getAdjUnvisitedVertex(theStack.peek());
            if (v == -1) {
                theStack.pop();
            } else {
                graph.getVertexArray()[v].setWasVisited(true);
                graph.displayVertex(v);
                theStack.push(v);
            }
        }
        for (int j = 0; j < graph.getnVertexes(); j++) {
            graph.getVertexArray()[j].setWasVisited(false);
        }
    }

    public static void bfs(Graph graph) {
        Queue queue = new Queue();
        graph.getVertexArray()[0].setWasVisited(true);
        graph.displayVertex(0);
        queue.insert(0);
        int v2;
        while (!queue.isEmpty()) {
            int v1 = queue.remove();
            while ((v2 = graph.getAdjUnvisitedVertex(v1)) != -1) {
                graph.getVertexArray()[v2].setWasVisited(true);
                graph.displayVertex(v2);
                queue.insert(v2);
            }
        }

        for (int j = 0; j < graph.getnVertexes(); j++) {
            graph.getVertexArray()[j].setWasVisited(false);
        }
    }

    public static void main(String[] args) {
        Graph graph = generateGraph();
        System.out.println("dfs");
        dfs(graph);
        System.out.println("bfs");
        bfs(graph);
    }

    public static Graph generateGraph() {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);
        return graph;
    }
}
