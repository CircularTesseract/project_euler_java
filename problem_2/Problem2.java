/** Solution to project euler problem 2. 
  *@author Alexandre Laporte
  *@return sum of even valued fib numbers bellow 4*10^6.  
 */
public class Problem2 { 
	public static void main(String[] args) { 
			int i = 1; 
			int sum = 0; 
			boolean cont = true; 
			while(cont) { 
					double nextVal = fib(i); 
					if(nextVal > 4000000) {
							cont = false; 
					} else if((int)nextVal %2 == 0) { 
							sum += (int)nextVal; 
					}
					i++; 
			}
			System.out.println(sum); //return sum to user
	}


	/**
	 * calculates the n'th term in the Fibonacci sequence using Binets Formula.
	 * Chosen over recursive method to ensure computational efficiency.
	 */  
	public static double fib(int n) { 
			return (Math.pow((1 + Math.sqrt(5)),n) - (Math.pow((1-Math.sqrt(5)),n)))/(Math.pow(2,n) * Math.sqrt(5));  
	}	
}
