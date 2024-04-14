import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    static void currents () {
        LocalDateTime t = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String formatedT = t.format(formatter);
        System.out.println(formatedT);
    }
}
