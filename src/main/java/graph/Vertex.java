package graph;

/**
 * Description 顶点
 * Author liuweibin
 * Date 2019/12/26 14:25
 **/
public class Vertex {
    private String label;
    private boolean wasVisited;

    public Vertex(String label, boolean wasVisited) {
        this.label = label;
        this.wasVisited = wasVisited;
    }

    public Vertex(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isWasVisited() {
        return wasVisited;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}
