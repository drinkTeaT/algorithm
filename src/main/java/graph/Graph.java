package graph;

/**
 * Description 图
 * Author liuweibin
 * Date 2019/12/26 14:37
 **/
public class Graph {
    private final int MAX_VERTEXES = 20;
    private Vertex vertexArray[];
    private int adjMat[][]; // 邻接表的大小为 n * n n代表节点
    private int nVertexes;

    public Graph() {
        vertexArray = new Vertex[MAX_VERTEXES];
        adjMat = new int[MAX_VERTEXES][MAX_VERTEXES];
        nVertexes = 0;
        for (int j = 0; j < MAX_VERTEXES; j++) {
            for (int k = 0; k < MAX_VERTEXES; k++) {
                adjMat[j][k] = 0;
            }
        }
    }

    public void addVertex(String label) {
        if (nVertexes >= MAX_VERTEXES) {
            throw new RuntimeException("超出最大限制");
        }
        vertexArray[nVertexes++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v) {
        System.out.println(vertexArray[v].getLabel());
    }

    public int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < nVertexes; j++) {
            if (adjMat[v][j] == 1 && vertexArray[j].isWasVisited() == false) {
                return j;
            }
        }
        return -1;
    }

    public int getMAX_VERTEXES() {
        return MAX_VERTEXES;
    }

    public Vertex[] getVertexArray() {
        return vertexArray;
    }

    public void setVertexArray(Vertex[] vertexArray) {
        this.vertexArray = vertexArray;
    }

    public int[][] getAdjMat() {
        return adjMat;
    }

    public void setAdjMat(int[][] adjMat) {
        this.adjMat = adjMat;
    }

    public int getnVertexes() {
        return nVertexes;
    }

    public void setnVertexes(int nVertexes) {
        this.nVertexes = nVertexes;
    }
}
