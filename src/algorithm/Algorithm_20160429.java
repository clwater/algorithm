package algorithm;

import java.util.*;

public class Algorithm_20160429 {

	public static void main(String[] args) {


	}
	
	//统计一个数字在排序数组中出现的次数。
	
	    	    public  int GetNumberOfK(int [] array , int k) {
	    	        int length = array.length;
	    	        if(length <=0 || array == null){
	    	            return 0;
	    	        }
	    	        int num = array[length/2];
	    	        int[] arrayLeft;
	    	        int[] arrayRight;
	    	        int count = 0;
	    	        if(num > k){
	    	            arrayLeft = Arrays.copyOfRange(array, 0, length/2);
	    	            count = GetNumberOfK(arrayLeft, k);
	    	        }
	    	        if(num < k){
	    	            arrayRight = Arrays.copyOfRange(array, length/2+1, length);
	    	            count = GetNumberOfK(arrayRight, k);
	    	        }
	    	        if(num == k){
	    	            count++;
	    	            int leftCount = 0;
	    	            int rightCount = 0;
	    	            int leftNum;
	    	            int rightNum;
	    	            for(int i = 1; i <= length/2; i++){
	    	                leftNum = array[length/2-i];
	    	                if(leftNum==k){
	    	                    leftCount++;
	    	                }else{             
	    	                    break;
	    	                }
	    	            }
	    	            count += leftCount;
	    	            for(int i = 1; i <= length/2-1;i++){
	    	                rightNum = array[length/2+i];
	    	                if(rightNum==k){
	    	                    rightCount++;
	    	                }else{
	    	                    break;             
	    	                }
	    	            }
	    	            count += rightCount;
	    	        }
	    	        return count;
	    	    }
	    	
	    
	
	
    
}
