package Season;

public enum Season {
    WINTER("winter"), SPRING("spring"), SUMMER("summer"){
        @Override // переопределение метода только для SUMMER
        public void getDescription() {
            System.out.println("The hot season");
        }
    }, AUTUMN("autumn");
    private String name;
    private int middleTemperature;

    Season(String name) {
        this.name = name;
    } // Конструкторы перечисления всегда являются private, можно создавать несколько конструкторов. Напр: Season(){}

    public String getName() {
        return name;
    }



    public void getDescription() {
        System.out.println("The cold season");
    }

    public void setMiddleTemperature(int middleTemperature) {
        this.middleTemperature = middleTemperature;
    }

    public int getMiddleTemperature() {
        return middleTemperature;
    }


}
