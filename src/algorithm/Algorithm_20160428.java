package algorithm;

import java.util.ArrayList;
import java.util.Vector;

public class Algorithm_20160428 {

	public static void main(String[] args) {
		
	}


	
	
	
	//输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。 
	//输出描述:

	    public ArrayList<Integer> FindNumbersWithSum(int [] a,int sum) {
	        int i = 0, j = a.length - 1, flag = -1;
	        ArrayList<Integer> al = new ArrayList<Integer>();
	         
	        if (a == null || a.length == 0) return al;
	         
	        while (i != j) {
	            if (a[i] + a[j] == sum) {
	                al.add(a[i]);
	                al.add(a[j]);
	                return al;
	            }
	            else if (flag == -1) i++;
	            else if (flag == 1) j--;
	            flag = flag * -1;
	        }
	         
	        return al;      
	    }
	}
}
}
