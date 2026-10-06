public class WorkHours {
    public static void main(String[] args) {
        int workHoursPerDay = 8;
        int workDaysPerWeek = 5;
        int workWeeksPerYear = 52;
        int workHours = workHoursPerDay * workDaysPerWeek * workWeeksPerYear;
        System.out.println("Godziny pracy w roku: " + workHours);
    }
}
