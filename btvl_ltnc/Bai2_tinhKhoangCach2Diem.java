package btvl_ltnc;

import java.util.Scanner;

public class Bai2_tinhKhoangCach2Diem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap toa do diem 1");
		System.out.println("Nhap x1:");
		double x1 = sc.nextDouble();
		System.out.println("Nhap y1: ");
		double y1 = sc.nextDouble();

		System.out.println("Nhap toa do diem 2");
		System.out.println("Nhap x2:");
		double x2 = sc.nextDouble();
		System.out.println("Nhap y2: ");
		double y2 = sc.nextDouble();
		

		double kc=Math.pow((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)),0.5);
		kc=Math.round(kc*100.0)/100.0;
		
		System.out.println("khong cach giau 2 diem ban vua nhap la: "+kc);

	}

}
