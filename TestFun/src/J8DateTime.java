import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class J8DateTime {

	public static void main(String[] args) {
		// 建立 LocalDate
		// 獲取當前年月日
		LocalDate localDate = LocalDate.now();
		// 構造指定的年月日
		LocalDate localDate1 = LocalDate.of(2019, 9, 12);
		// 獲取年、月、日、星期幾
		int year = localDate.getDayOfYear();//.getYear();
		int year1 = localDate.get(ChronoField.YEAR);
		System.out.println("year "+year);
		System.out.println("year1 "+year1);
		System.out.println(" ");
		Month month = localDate1.getMonth();
		int month1 = localDate1.get(ChronoField.MONTH_OF_YEAR);

	}

}
