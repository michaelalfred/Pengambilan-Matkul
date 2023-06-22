package ProjectTopo;

public class Vertex {
    private String label; // membuat atribut label bertipe String
    private boolean visited = false; // membuat atribut visited bertipe boolean

    // getter dan setter
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean visited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
