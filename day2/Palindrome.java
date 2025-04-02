package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 12321;
		int reverse = 0;
		int remainder = 0 ;
		
		int originalnum = num;
		
		while (num!=0) {
			
			remainder = num%10;
			reverse = reverse * 10 + remainder;
			num = num/10;
			
		}

		if (originalnum == reverse) {
			System.out.println(originalnum + " is palindrome");
	}
		else {
			System.out.println(originalnum + " is not palindrome");
		}

}
}
