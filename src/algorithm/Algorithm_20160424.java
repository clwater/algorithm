package algorithm;

import java.util.ArrayList;
import java.util.Vector;

public class Algorithm_20160424 {

	public static void main(String[] args) {


	}
	
    
	 /*LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
	  * 他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！
	  * ！“红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,他想了想,决定大\小 
	  * 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分
	  * 别看作2和4),“So Lucky!”。LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,然后告诉
	  * 我们LL的运气如何。为了方便起见,你可以认为大小王是0。*/
	 public boolean isContinuous(int [] numbers) {
	
		 
		 return true;
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
