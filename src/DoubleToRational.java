
public class DoubleToRational {
	//convert a double number to rational

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(convert(0.3248));
	}
	public static String convert(double n){
		int tenPoly = 1;
		int divident;
		int dividor;
		String result = "";
		while(n*tenPoly-(int)(n*tenPoly)>0){
			tenPoly*=10;
		}
		divident = (int)(n*tenPoly);
		dividor = tenPoly;
		int gcd = GCD(divident,dividor);
		divident = divident/gcd;
		dividor = dividor/gcd;
		result = result+ divident+"/"+dividor;
		return result;
	}
	
	
	public static int GCD(int a,int b){  //assume a < b
		if(b%a==0){
			return a;
		} else {
			int c;
			c=(b%a);
			return GCD(c,a);
			
		}
	}

}
