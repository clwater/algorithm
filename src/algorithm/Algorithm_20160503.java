package algorithm;

import java.util.Vector;

public class Algorithm_20160503 {

	public static void main(String[] args) {


	}
	
	//求出任意非负整数区间中1出现的次数。
	public int NumberOf1Between1AndN_Solution(int n) {
		int ones = 0, m = 1, r = 1;
	    while (n > 0) {
	        ones += (n + 8) / 10 * m + (n % 10 == 1 ? r : 0);
	        r += n % 10 * m;
	        m *= 10;
	        n /= 10;
	    }
	    return ones;
		
    }
	
	

	//写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
	 public int Add(int num1,int num2) {
	        
		 
		 return 1;
	    }
	
	
    
}
