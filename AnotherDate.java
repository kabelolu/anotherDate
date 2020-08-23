import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;


class AnotherDate{

public static void main(String [] args){

LocalDate wedding = LocalDate.of(2017,07,07);
System.out.println(wedding);
wedding = wedding.plusDays(21);
wedding = wedding.plusMonths(2);
wedding = wedding.plusYears(2);
System.out.println(wedding);
LocalTime takeOffTime = LocalTime.of(20,20,20);
System.out.println(takeOffTime);
takeOffTime = takeOffTime.plusHours(2);
takeOffTime = takeOffTime.plusMinutes(2);
takeOffTime = takeOffTime.plusSeconds(2);
System.out.println(takeOffTime);
LocalDateTime takeOff = LocalDateTime.of(2017,07,07,20,20,20);
System.out.println(takeOff);
ZonedDateTime gameTime = ZonedDateTime.of(takeOff,ZoneId.of("Africa/Johannesburg"));
System.out.println(gameTime);

}
}
