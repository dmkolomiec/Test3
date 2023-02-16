import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime ld = LocalTime.now();
        System.out.printf("Local time: %d:%d:%d\n",ld.getHour(),ld.getMinute(),ld.getSecond());
    }
}
