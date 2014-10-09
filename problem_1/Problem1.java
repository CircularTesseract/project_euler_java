public class problem1 {
	/** Computes the sum of the numbers
	 * divisible by 3 or 5 bellow (including) 1000;
	 * @param (none)
	 * @return sum to standard out. 
	 */ 
	public static void main(String[] args) { 
		int sum = 0;
		for(int i = 1; i <= 1000; i++)  { 
				if(i%5==0 || i%3 == 0)
						sum +=i; 
		}
		System.out.println(sum); 
	}
}