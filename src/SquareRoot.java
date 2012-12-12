
public class SquareRoot {
	//get the square root of a number

	/**
	 * @param args
	 */
	//precision control has problem.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSquareRoot(4,0.000001));

	}
	
	public static double getSquareRoot(double number,double precision){
		//check if number is a non-negative number
		if(number < 0){
			return -1;
		}
		//if number=0 or number=1, sqrt(number)=number
		if(number == 0 || number == 1){
			return number;
		}
		
		
		double root = 0.00;
		
		if(number < 1){ //number < square(number) <1
			root = calculate(number,1,number,precision);
		} else {
			root = calculate(1,number,number,precision);
		}
		
		
		return root;
	}

	//use binary search to find the result
	private static double calculate(double min, double max, double target,double precision) {
		
		double mid = (min + max)/2;
		double result = mid*mid;
		
		if(result == target){  //find the exact result
			return mid;
		} else if(result>target){ //focus on the smaller part
			max = mid;
			if(max-min<=precision){  //check the precision
				return mid;
			}
			return calculate(min,max,target,precision);
		} else {  //focus on the bigger part
			min = mid;
			if(max-min<=precision){  //check the precision
				return mid;
			}
			return calculate(mid,max,target,precision);
		}
	
	}

}
