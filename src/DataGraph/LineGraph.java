package DataGraph;

import javax.xml.crypto.Data;

public class LineGraph {
    private DataGraph dataGraph;

    public LineGraph(DataGraph dataGraph) {
        this.dataGraph = dataGraph;
    }

    public void draw() {
        System.out.println("Точки в графиук соединяются: " + dataGraph.getData());
    }
}
