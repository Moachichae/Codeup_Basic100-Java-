package basicProblem100.solving01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CodeUp1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String[] output = sc.nextLine().split("\\.");	
		Calendar cal = new GregorianCalendar(Integer.parseInt(output[0]), 
				Integer.parseInt(output[1])-1, Integer.parseInt(output[2]));
		Date date = cal.getTime();		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String outputDate = sdf.format(date);
		System.out.println(outputDate);
		
		System.out.println("====================================");
		
		System.out.printf("%02d-%02d-%04d", Integer.parseInt(output[2]),
				Integer.parseInt(output[1]),Integer.parseInt(output[0]));
		
		
		sc.close();
	} // end main()

} // end CodeUp1027
