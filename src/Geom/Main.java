package Geom;

public class Main {
    public static void main(String[] args) {
        Geom[] g = new Geom[3];
        g[0] = new Point(GeomType.POINT);
        g[1] = new Line(GeomType.LINE);
        g[2] = new Triangle(GeomType.TRIANGLE);
        for (Geom fig : g) {
            switch (fig.geomType) {
                case POINT :
                    ((Point) fig).getPointPrint();
                    break;
                case LINE :
                    ((Line) fig).getLinePrint();
                    break;
                case TRIANGLE :
                    ((Triangle) fig).getTrianglePrint();
                    break;
            }
        }
        for (GeomType type : GeomType.values()) {
            System.out.println(type + " = " + type.ordinal());
        }
        GeomType[] types = new GeomType[3];
        types[0] = GeomType.POINT;
        types[1] = GeomType.LINE;
        types[2] = GeomType.TRIANGLE;

        for (GeomType type : types) {
            if (GeomType.POINT.equals(type)) {
                System.out.println("Константа POINT");
            }
            if (GeomType.LINE.equals(type)) {
                System.out.println("Константа LINE");
            }
            if (GeomType.TRIANGLE.equals(type)) {
                System.out.println("Константа TRIANGLE");
            }
        }
        System.out.println(types[0].compareTo(types[1]));
        System.out.println(types[1].compareTo(types[0]));

        for (GeomType type : types) {
            System.out.println(type.getValue());
        }
    }
}
