
public class SquareRoot {
	//get the square root of a number

	/**
	 * @param args
	 */
	//precision control has problem.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSquareRoot(34.56));

	}
	
	public static double getSquareRoot(double number){
		
		double root = 0.00;
		if(number < 1){ //number < square(number) <1
			root = calculate(number,1,number,0.001);
		} else {
			root = calculate(1,number,number,0.001);
		}
		
		
		return root;
	}

	private static double calculate(double min, double max, double target,double precision) {
		// TODO Auto-generated method stub
		double mid = (min + max)/2;
		double result = mid*mid;
		double p = precision * precision;
		if(result>(target-p)&&result<(target+p)){
			return mid;
		} else if(result>target){
			return calculate(min,mid,target,precision);
		} else {
			return calculate(mid,max,target,precision);
		}
	
	}

}
