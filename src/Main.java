import java.time.LocalDate;
//import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
//        LocalDateTime ld = LocalDateTime.now();
        LocalDate ld = LocalDate.now();
        System.out.printf("Local Date: %d.%d.%d (%s)\n",ld.getDayOfMonth(),ld.getMonthValue(),ld.getYear(),ld.getDayOfWeek());
    }
}
