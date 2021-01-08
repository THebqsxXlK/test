package enums;

public class EnumsMain2 {
    public static void main(String[] args) {
        String dayName = "TUESDAY".toUpperCase();
        Day[] values = Day.values();

        Day day = null;
        for (Day value : values) {
            if(value.name().toUpperCase().equals(dayName)){
                day = value;
                break;
            }
        }

        System.out.println(day.getRusName());
        System.out.println(day.isWeekend());
    }
}
