package DataGraph;

public class BarGraph {
    private DataGraph dataGraph;

    public BarGraph(DataGraph dataGraph) {
        this.dataGraph = dataGraph;
    }

    public void draw() {
        System.out.println("График в виде столбцов: " + dataGraph.getData());
    }
}
