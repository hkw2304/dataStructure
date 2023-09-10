package array_class;

import java.util.Scanner;

public class PhysicalExamination {
	static final int VMAX = 21;
	
	static class PhyscData{
		String name;
		int height;
		double vision;
		public PhyscData(String name, int height, double vision) {
			super();
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		for(int i = 0; i < dat.length; i++) {
			sum += dat[i].height;
		}
		return sum / dat.length;
	}
	static void distVision(PhyscData[] dat, String[] vdist) {
		int i = 0;
		for(int j = 0; j < VMAX; j++) {
			vdist[j] = "";
		}
		for(i = 0; i < dat.length; i++) {
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
				vdist[(int)(dat[i].vision * 10)] += "*";
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhyscData[] x = {
				new PhyscData("현기원", 162, 0.3),
				new PhyscData("현기투", 173, 0.3),
				new PhyscData("현기삼", 175, 2.0),
				new PhyscData("현기사", 165, 1.5),
				new PhyscData("현기오", 166, 0.4),
				new PhyscData("현기육", 167, 1.2),
				new PhyscData("현기칠", 168, 0.8),
		};
		String[] vdist = new String[VMAX];
		
		System.out.println("## 신체검사 리스트 ##");
		System.out.println("이름\t키\t시력\t");
		System.out.println("--------------------------");
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i].name+"\t"+ + x[i].height+"\t"+ + x[i].vision);
			
		}
		System.out.println("평균 키 : " + aveHeight(x) + "cm");
		distVision(x, vdist);
		
		System.out.println("시력분포");
		for(int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f~: %s\n", i / 10.0, vdist[i]);
		}
	}
}
