package tuan2;

import java.util.Scanner;

public class TestBaiTap {

	public static void main(String[] args) {
//
//		// test bai1
//
////		Rectangle h1 = new Rectangle(3.2, 4.3);
////		System.out.println("Dien tich hinh h1 la: " + h1.getArea());
////		System.out.println("Chu vi hinh chu nhat la: " + h1.getPerimeter());
//
		// test bai2
		Scanner sc = new Scanner(System.in);
		TV tv = new TV();
		System.out.println("an 1 de bat TV, an phim khac de tat");
		int on = sc.nextInt();
		if (on == 1) {
			tv.turnOn();
			}
		while (tv.getOn()) {
			System.out.println("*****Moi ban lua chon*****");
			System.out.println("1,Chon channel(1-120):\n" 
					+ "2,Chon volume(1-7)\n" 
					+ "3,Tien channel\n"
					+ "4,Lui channel\n" 
					+ "5,Tang volume 1 level \n" 
					+ "6,Giam volume 1 level\n" 
					+ "7,Tat Tv");
			int luaChon=sc.nextInt();
			switch (luaChon) {
			case 1: {
				System.out.println("Nhap kenh muon xem(1-120)");
				int kenh = sc.nextInt();
				tv.setChannel(kenh);
				break;
			}
			case 2: {
				System.out.println("Nhap volume ban muon(1-7)");
				int vl = sc.nextInt();
				tv.setVolume(vl);
				break;
			}
			case 3: {
				tv.channelUp();
				break;
			}
			case 4: {
				tv.channelDown();
				break;
			}
			case 5: {
				tv.volumeUp();
				break;
			}
			case 6: {
				tv.volumeDown();
				break;
			}
			case 7: {
				tv.turnOff();
				break;
			}

			}

		}
		// test bài 5
//		StopWatch sw = new StopWatch();
//			sw.start();
//			
//			 for (int i = 0; i < 10000; i++) {
//				System.out.println("abc");
//			}
//			 sw.end();
//			 System.out.println(sw.getStartTime());
//			 System.out.println(sw.getEndTime());
//			 System.out.println(sw.getElapsedTime());
		
	}

}







