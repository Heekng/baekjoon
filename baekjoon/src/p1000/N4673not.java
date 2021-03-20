package p1000;

public class N4673not {
	public static void main(String[] args) {
		boolean [] resultAr = new boolean [10000];
		for (int i = 1; i <= 10000; i++) {
			resultAr[d(i)] = true;
		}
		for (int i = 0; i < resultAr.length; i++) {
			if(resultAr[i] == false) {
				System.out.println(i);
			}
		}
	}
	
	public static int d(int num) {
		int result = num;
		String strNum = num + "";
		for (int i = 0; i < strNum.length(); i++) {
			result += num % 10;
			num /= 10;
		}
		return result;
	}
}
