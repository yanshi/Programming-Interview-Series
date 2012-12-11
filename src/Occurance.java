
public class Occurance {
	//Count occurance of a given number 
	//in a sorted array allowing duplicates using binary search

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,2,2,3,4,5,6,6,6,7,8,8,8,8,8,9};
		System.out.println(getOccurance(a,0,a.length-1,6));
	}
	
	public static int getOccurance(int[] array,int min, int max, int target){
		if(min>max){ //if the array is empty, no target is there
			return 0;
		}
		if(array[min]>target&&array[max]<target){
			return 0; //the largest number of array is still less than the target, no target in the arry;
			          //the smallest number of the array is greater than the target, no target in the array
		}
		int count = 0;
		int mid = (min+max)/2;
		if (array[mid]== target){
			//mid number equals the target number, target number may exist in both the left and right part.
			count = 1 + getOccurance(array,min,mid-1,target)+getOccurance(array,mid+1,max,target);
		} else if(array[mid]<target){
			//mid number less than target, target may be in the right part
			count = getOccurance(array, mid+1,max,target);
		} else {
			//otherwise, target numbers are in the left part.
			count = getOccurance(array,min,mid-1,target);
		}
		return count;
	}
	

}
