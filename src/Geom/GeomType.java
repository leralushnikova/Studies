package Geom;

public enum GeomType {
    POINT("point"), LINE("line"), TRIANGLE("triangle");
    private String value;

    GeomType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
