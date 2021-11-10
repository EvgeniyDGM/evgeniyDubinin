package homework6.hw_6_1_Enum;

public enum DaysOfWeek {

    MONDAY ("mon"),
    TUESDAY ("tue"),
    WEDNESDAY ("wed"),
    THURSDAY ("thu"),
    FRIDAY ("fri"),
    SATURDAY ("sut"),
    SUNDAY ("sun");



    private String dayOfWeek;


    DaysOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

}
