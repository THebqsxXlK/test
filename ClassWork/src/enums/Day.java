package enums;

public enum Day {
    mONDAY("Понедельник", false),
    TUESDAY("Вторник", false),
    WEDNESDAY("Среда", false),
    THURSDAY("Четверг", false),
    FRIDAY("Пятница", false),
    SATURDAY("Суббота", true),
    SUNDAY("Воскресень", true),
    SUNDAY2("Наконец отдых", true);

    private String rusName;
    private boolean weekend;

    private Day(String rusName, boolean weekend){
        this.rusName = rusName;
        this.weekend = weekend;
    }

    public String getRusName(){
        return this.rusName;
    }

    public boolean isWeekend() {
        return weekend;
    }
}
