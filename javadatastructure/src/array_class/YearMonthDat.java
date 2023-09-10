package array_class;
class YMD{
	int year;
	int month;
	int days;
	public YMD(int year, int month, int days) {
		super();
		this.year = year;
		this.month = month;
		this.days = days;
	}
	public int afterDay(int n) {
		
		return days + n;
	}
	public int beforeDay(int n) {
		return days - n;
	}
	
}
public class YearMonthDat {
	
	public static void main(String[] args) {
		YMD ymd = new YMD(2023,07,07);
		int afterday = ymd.afterDay(3);
		int beforeday = ymd.beforeDay(3);
		
		System.out.println("afterday() : " + afterday);
		System.out.println("beforeday() : " + beforeday);
	}
}
