package tuan2;

import java.util.Date;
import java.util.Random;

public class Ngay {
public static void main(String[] args) {
//	Date date = new Date();
//	System.out.println("\nThe dates and times for elapsedtimes 10000, "  +
//			"100000, 1000000, 10000000,\n100000000, 1000000000, 10000000000," +
//			" and 100000000000, respectively");
//		for (long i = 10000; i <= 1e11; i *= 10) {
//			date.setTime(i);
//			System.out.println(date.toString());
//		}
//	System.out.println(""+1e11);
	  Random rd = new Random(1000);
	  Random rd2 = new Random(1001);
	  System.out.println(rd.nextInt(100)+"  "+rd2.nextInt(100));
//	  int count = 1;
//	  while(count <= 50) {
//		  System.out.println("số thứ "+count);
//		  System.out.println(rd.nextInt(100));
//		  count++;
//	  }

}
}
