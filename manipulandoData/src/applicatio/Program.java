package applicatio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		System.out.print("Data de nascimento: ");
		Date x = sdf.parse(sc.nextLine());
		cal.setTime(x);
		int month = 1 + cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		System.out.println(month);
		System.out.println(year);

	}
	 
}
