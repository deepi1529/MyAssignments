package week1.day2;

public class IsPrime {

	public static void main(String[] args) {

		 int number = 32; 
	        boolean isPrime = true;
	        
	        if (number <= 1) {
	            isPrime = false;
	        } else {
	           
	            for (int i = 2; i < number; i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break; 
	                }
	            }
	        }

	    
	        if (isPrime) {
	            System.out.println(number + " is a Prime number.");
	        } else {
	            System.out.println(number + " is not a Prime number.");
	        }
		

	}

}

