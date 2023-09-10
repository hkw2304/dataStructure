package searching;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class PhyscData2{
	private String name;
	private int height;
	private double vision;
	public PhyscData2(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + height + " " + vision;
	}
	public static final Comparator<PhyscData2> VISION_ORDER = new VisionOrderComparator();
	private static class VisionOrderComparator implements Comparator<PhyscData2>{
		public int compare(PhyscData2 d1, PhyscData2 d2) {
			return (d1.vision > d2.vision)? 1 :(d1.vision < d2.vision) ? -1 : 0;
		}
}

}
public class PhysExamSearch2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhyscData2[] arr = {
				new PhyscData2("현기원", 162, 0.3),
				new PhyscData2("현기투", 169, 0.4),
				new PhyscData2("현기삼", 171, 0.8),
				new PhyscData2("현기사", 173, 1.5),
				new PhyscData2("현기오", 168, 1.7),
				new PhyscData2("현기육", 174, 1.2),
				new PhyscData2("현기칠", 175, 2.0),
		};
		System.out.print("시력이 몇인 사람을 찾고 있나요 : ");
		double sight = sc.nextDouble();
		int index = Arrays.binarySearch(arr, new PhyscData2("", 0, sight), PhyscData2.VISION_ORDER);
		if (index < 0)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(arr[index] + "은 arr[" + index + "]에 있습니다.");
	}
}
