package algorithm;

import java.util.ArrayList;
import java.util.Vector;

public class Algorithm_20160424 {

	public static void main(String[] args) {


	}
	
    

	 
	 
	 //输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
	 public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
	     
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 if (input.length < k || k == 0) {
			 return list;
		 }
		 
		 for (int i = 0; i < input.length; i++) {
			 if (list.size() < k || (list.size() >= k && list.get(k - 1) > input[i])) {
				 int j;
				 int startIndex = list.size() > k? k-1:list.size() - 1;
				 for (j = startIndex; j > -1 && list.get(j) > input[i]; j--);
				 list.add(j + 1, input[i]);
			 }
		 }
		 while (list.size() > k) {
		 list.remove(k);
		 }
		 
		 return list;
		 
	 }
}
