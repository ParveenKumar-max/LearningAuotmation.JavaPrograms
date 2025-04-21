package Ex_01_JavaBasics.Ex56_StaticKeyword;

public class Ex56_02_ENUM {

    public static void main(String[] args) {

        Day today = Day.MONDAY;
        System.out.println("Today is :" + today);

        System.out.println("--------------------");

        for (Day day : Day.values()){
            System.out.println(day);
        }

    }
}

enum Day{

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURRDAY

}