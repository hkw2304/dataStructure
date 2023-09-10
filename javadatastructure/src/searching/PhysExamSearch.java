package searching;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class PhyscData{
	private String name;
	private int height;
	private double vision;
	public PhyscData(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + height + " " + vision;
	}
	public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
	private static class HeightOrderComparator implements Comparator<PhyscData>{
		public int compare(PhyscData d1, PhyscData d2) {
			return (d1.height > d2.height)? 1 :(d1.height < d2.height) ? -1 : 0;
		}
}

}
public class PhysExamSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhyscData[] arr = {
				new PhyscData("현기원", 162, 0.3),
				new PhyscData("현기투", 169, 0.4),
				new PhyscData("현기삼", 171, 0.8),
				new PhyscData("현기사", 173, 1.5),
				new PhyscData("현기오", 168, 0.7),
				new PhyscData("현기육", 174, 1.2),
				new PhyscData("현기칠", 175, 2.0),
		};
		System.out.print("키가 몇 cm인 사람을 찾고 있나요 : ");
		int height = sc.nextInt();
		int index = Arrays.binarySearch(arr, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);
		if (index < 0)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(arr[index] + "은 arr[" + index + "]에 있습니다.");
	}
}
