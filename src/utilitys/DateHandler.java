package utilitys;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateHandler {
	
	private static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	public static String dateToString(LocalDate date) {
		return date.format(dateFormat);
	}
	
	public static LocalDate stringToDate(String stringDate) {
		return LocalDate.parse(stringDate, dateFormat);
	}
	
	public static long daysBetween(LocalDate date1, LocalDate date2) {
		return ChronoUnit.DAYS.between(date1, date2);
	}

}
