import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class J8DateTime {

	public static void main(String[] args) {
		
		//branch dev
		LocalDate localDate = LocalDate.now();
		
		LocalDate localDate1 = LocalDate.of(2019, 9, 12);
		
		int year = localDate.getDayOfYear();//.getYear();
		int year1 = localDate.get(ChronoField.YEAR);
		System.out.println("year "+year);
		System.out.println("year1 "+year1);
		System.out.println(" ");
		Month month = localDate1.getMonth();
		int month1 = localDate1.get(ChronoField.MONTH_OF_YEAR);

	}

}
