package date;



import java.util.Arrays;
import java.util.List;


public class date {

	private int day1;
	private int month1;
	private int year1;
	private int day2;
	private int month2;
	private int year2;

	public int getDay1() {
		return day1;
	}

	public void setDay1(int day1) {
		this.day1 = day1;
	}

	public int getMonth1() {
		return month1;
	}

	public void setMonth1(int month1) {
		this.month1 = month1;
	}

	public int getYear1() {
		return year1;
	}

	public void setYear1(int year1) {
		this.year1 = year1;
	}

	public int getDay2() {
		return day2;
	}

	public void setDay2(int day2) {
		this.day2 = day2;
	}

	public int getMonth2() {
		return month2;
	}

	public void setMonth2(int month2) {
		this.month2 = month2;
	}

	public int getYear2() {
		return year2;
	}

	public void setYear2(int year2) {
		this.year2 = year2;
	}

	public date(int day1, int month1, int year1, int day2, int month2, int year2) {
		super();
		this.day1 = day1;
		this.month1 = month1;
		this.year1 = year1;
		this.day2 = day2;
		this.month2 = month2;
		this.year2 = year2;
	}

	public date() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int difference() {

		int yearMax;
		int yearMin;
		int monthMax;
		int monthMin;
		int dayMax;
		int dayMin;

		if (year1 > year2) {
			yearMax = year1;
			monthMax = month1;
			dayMax = day1;
			yearMin = year2;
			monthMin = month2;
			dayMin = day2;

		} else if (year2 > year1) {
			yearMax = year2;
			monthMax = month2;
			dayMax = day2;
			yearMin = year1;
			monthMin = month1;
			dayMin = day1;
		} else {
			yearMax = year2;
			monthMax = month2;
			dayMax = day2;
			yearMin = year1;
			monthMin = month1;
			dayMin = day1;

		}
		// 23-11-23
		// 10-10-23
		int dayDiff;
		dayDiff = dayMax - dayMin;
		int monthDiff = diffrenceInMonth(monthMax, monthMin, isLeap(yearMin));
		int yeardiff = diffInYear(yearMax, yearMin, LeapCount(yearMax, yearMin));
		System.out.println("day diff in dates id " + (yeardiff + monthDiff + dayDiff));

		return 0;
	}

	public boolean isLeap(int Year) {
		boolean ruslt = false;

		for (int i = 1800; i <= Year; i = i + 4) {

			if (i == Year) {
				ruslt = true;
			}
		}

		return ruslt;

	}
	public int LeapCount(int Year,int year1) {
		int ruslt = 0;

		for (int i = 1800; i <= Year; i = i + 4) {

			if (i>year1 && i<=Year) {
				ruslt = ruslt+1;
			}
		}

		return ruslt;

	}
	

	private int diffrenceInMonth(int month1, int month2, boolean isleap) {
		List<Integer> lst;
		if (isleap) {
			lst = Arrays.asList(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);

		} else {
			lst = Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
		}
		int daycount = 0;
		if (month1 > month2) {
			for (int i = month2; i < month1; i++) {
				daycount = daycount + lst.get(i - 1);

			}

		} else if (month2 > month1) {
			for (int i = month2; i > month1; i--) {
				daycount = daycount - lst.get(i - 2);
//				System.out.println(i);
			}

		}
//		System.out.println(daycount);
		return daycount;

	}

	private int diffInYear(int year1, int year2, int isleapcount) {
		return ((year1 - year2) * 365 + isleapcount);

	}

	

}
