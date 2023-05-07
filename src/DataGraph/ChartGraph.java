package DataGraph;

import java.util.logging.StreamHandler;

public class ChartGraph {
    private DataGraph dataGraph;

    public ChartGraph(DataGraph dataGraph) {
        this.dataGraph = dataGraph;
    }

    public void draw() {
        System.out.println("График в виде круговой диаграммы: " + dataGraph.getData());
    }
}
