package enums;

public class EnumsMain1 {
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

        switch (day){
            case mONDAY:
                System.out.println("Понедельник");
                break;
            case TUESDAY:
                System.out.println("Вторник");
                break;
            case WEDNESDAY:
                System.out.println("Среда");
                break;
            case THURSDAY:
                System.out.println("Четверг");
                break;
            case FRIDAY:
                System.out.println("Пятница");
                break;
            case SATURDAY:
                System.out.println("Суббота");
                break;
            case SUNDAY:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Неизвестный день недели");
        }


    }
}
