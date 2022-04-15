package btvl_ltnc;

import java.util.Scanner;

public class Bai3_xacDinhDuongTron {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// nhap thong so cho duong tron 1
		System.out.println("Moi nhap toa do tam va ban kinh cua duong tron 1:");
		System.out.println("Moi nhap toa do tam I1(a1,b1):");
		System.out.println("Nhap a1: ");
		double a1= sc.nextDouble();
		System.out.println("Nhap b1: ");
		double b1= sc.nextDouble();
		System.out.println("Nhap ban kinh R1: ");
		double r1=sc.nextDouble();
		// nhap thong so cho duong tron 2
		System.out.println("Moi nhap toa do tam va ban kinh cua duong tron 2:");
		System.out.println("Moi nhap toa do tam I2(a2,b2):");
		System.out.println("Nhap a2: ");
		double a2= sc.nextDouble();
		System.out.println("Nhap b2: ");
		double b2= sc.nextDouble();
		System.out.println("Nhap ban kinh R2: ");
		double r2=sc.nextDouble();
		
		// khoang cach giua hai tam
		double kc= Math.pow((Math.pow(a2-a1,2)+Math.pow(b2-b1,2)),0.5);
		
		// 
		if(kc<=(r1-r2)) {
			System.out.println("Vong tron 2 nam ben trong vong tron 1");
		} else if(kc<=(r1+r2)) {
			System.out.println("Vong tron 2 giao voi vong tron 1");
		}else if(kc>(r1+r2)) {
			System.out.println("Vong tron 2 nam ngoai vong trong 1");
		}
		
		
	}

}
