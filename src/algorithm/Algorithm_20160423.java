package algorithm;

import java.util.ArrayList;
import java.util.Vector;

public class Algorithm_20160423 {

	public static void main(String[] args) {
		//int [][] matrix = {{1,2},{3,4}};
		//int [][] matrix = {{1},{2},{3},{4},{5}};
		//int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		//printMatrix(matrix);
		
		
		//int[] array = {2,4,3,6,3,2,5,5};
		int[] array = {4,6,1,1,1,1};
		int[] num1 = {0};
		int[] num2 = {0};
		FindNumsAppearOnce(array , num1 ,num2 );
		
	}
	
	
	//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
	//例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
	//则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
	public static ArrayList<Integer> printMatrix(int [][] array) {
			ArrayList<Integer> result = new ArrayList<Integer> ();
	        if(array.length==0) return result;
	        int n = array.length,m = array[0].length;
	        if(m==0) return result;
	        int layers = (Math.min(n,m)-1)/2+1;//这个是层数
	        for(int i=0;i<layers;i++){
	            for(int k = i;k<m-i;k++) result.add(array[i][k]);//左至右
	            for(int j=i+1;j<n-i;j++) result.add(array[j][m-i-1]);//右上至右下
	            for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--) result.add(array[n-i-1][k]);//右至左
	            for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--) result.add(array[j][i]);//左下至左上
	        }
	        return result;
    }
	
	//num1,num2分别为长度为1的数组。传出参数
	//将num1[0],num2[0]设置为返回结果
	//一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
	 public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		 
		 if(array.length == 1){
			 return ;
		 }
		 
		 int n = array.length;
	   	  for(int i =0 ; i< n -1; ++i) {  
	   	        for(int j = 0; j < n-i-1; ++j) {  
	   	            if(array[j] > array[j+1])  
	   	            {  
	   	                int tmp = array[j] ; 
	   	                array[j] = array[j+1] ; 
	   	                array[j+1] = tmp;  
	   	            }  
	   	        }  
	   	    }
	   	  
	   	  
	   	  for( int i = 0 ; i < n ;i++){
	   		  System.out.println(array[i]);
	   	  }
	   	  
	   	  n = array.length;
	   	  System.out.println("	" + n);
	   	  int index = 0;
	   	  if(array[0] != array[1] ){
	   		  num1[0] = array[0];
	   		  index = 1;
	   	  }
	   	  if(array[ n - 2 ] != array[ n - 1 ] ){
	   		  num2[0] = array[ n - 1 ];
	   	  
	   	  }
	   	  
	   	  
	   	  
	   	  for( int i = 1 ; i < n - 1 ; i++){
	   		  
	   		  System.out.println("array[i]    " + array[i] + "    array[i-1]    " + array[i-1]);
	   		  System.out.println("array[i]    " + array[i] + "    array[i+1]    " + array[i+1]); 
	   		  if(( array[i] !=  array[i-1]) &&( array[i] != array[i+1])){
	   			  
	   			  if(index == 0){
	   				  num1[0] = array[i];
	   			  }else{
	   				  num2[0] = array[i];
	   			  }
	   		  }
	   	  }
	   	  
	   	  System.out.println("1:" + num1[0]);

	   	  System.out.println("2:" + num2[0]);
	    }
	 
	 
	 //汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
	 //对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,要求输
		//	 出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
	 public String LeftRotateString(String str,int n) {
		 if(str.length() < n) return null;
		 return str.substring(n, str.length()) + str.substring(0 , n -1);
	   }
	 
    
}
