package Season;

public class Main {
    public static void main(String[] args) {
        System.out.println(Season.WINTER.getClass());
        for (Season season : Season.values()) { // values() выводит все перечисления созданные в enum
            System.out.println(season + " = " + season.ordinal()); //ordinal() - показывает под каким номером стоит имя в перечислении
        }
        Season season = Season.valueOf("SUMMER");
        System.out.println(season);
        loveSeason(season);
        // valuesOf(имя) - имя должно четно совпадать с наименованием перечисления
        // compareTo() - выводит на экран число, сравниваем, где находится число. Если число > 0, то означает, что первое число больше чем второе. Если < 0, то второе число больше, чем первое. Если 0, то числа совпадают
        Season[] seasons = new Season[4];
        seasons[0] = Season.WINTER;
        seasons[1] = Season.SPRING;
        seasons[2] = Season.SUMMER;
        seasons[3] = Season.AUTUMN;
        System.out.println(seasons[2].compareTo(seasons[0]));
//        for (Season season : seasons) {
//            season.getFavouriteSeason();
//        }
        seasons[2].setMiddleTemperature(23);
        seasons[0].setMiddleTemperature(-3);
        seasons[1].setMiddleTemperature(11);
        seasons[3].setMiddleTemperature(5);
        char symbol = '\u2103'; //- символ градус цельсия
        for (Season s : seasons) {
            System.out.println("The middle temperature " + s.getName() + " = " + s.getMiddleTemperature()+symbol);
            s.getDescription();
        }


    }

    public static void loveSeason(Season season) {
        switch (season){
            case SPRING -> System.out.println("I like spring");
            case AUTUMN -> System.out.println("I like autumn");
            case WINTER -> System.out.println("I like winter");
            case SUMMER -> System.out.println("I like summer");
        }
    }
}
