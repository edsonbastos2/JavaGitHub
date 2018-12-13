package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		System.out.print("Data de nascimento: ");
		Date x2 = sdf1.parse(sc.nextLine());
		Date x1 = new Date();
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:07:00");
		System.out.println("-----------------------");
		System.out.println("y1 " + sdf1.format(y1));
		System.out.println("y2 " + sdf2.format(y2));
		System.out.println("x1 " + sdf2.format(x1));
		System.out.println("x2 " + sdf1.format(x2));
	} 

}
