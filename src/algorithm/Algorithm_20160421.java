package algorithm;

import java.util.Vector;

public class Algorithm_20160421 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("aa");
		

	}
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}

	//输入两颗二叉树A，B，判断B是不是A的子结构。
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null) return false;
        if(root1==null && root2!=null) return false;        
        boolean flag = false;
        if(root1.val==root2.val){
            flag = isSubTree(root1,root2);
        }
        if(!flag){
            flag = HasSubtree(root1.left, root2);
            if(!flag){
                flag = HasSubtree(root1.right, root2);
            }
        }
        return flag;
    }
     
    private boolean isSubTree(TreeNode root1, TreeNode root2) {
        if(root2==null) return true;
        if(root1==null && root2!=null) return false;        
        if(root1.val==root2.val){
            return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
        }
        return false;
    }
    //请实现一个算法，确定一个字符串的所有字符是否全都不同。这里我们要求不允许使用额外的存储结构。
    public static boolean checkDifferent(String iniString) {
    	Vector<date> tab = new Vector<date>();
    	for(int i = 0 ; i < iniString.length() ; i++){
    		char c  = iniString.charAt(i);
    		boolean pd = true;
    		for(int j = 0 ; j < tab.size() ; j++){
    			if(c == tab.get(j).c){
    				tab.get(j).pd = false;
    				pd = false;
    			}
    		}
    		if(pd){
    			date d = new date();
				d.c = c;
				tab.add(d);
    		}
			pd = true;
    	}
    	for( int i = 0 ; i < tab.size() ; i++){
    		if(tab.get(i).pd == false){
    			return false;
    		}
    	}
        return true;
    }
    
    public static class date{
		char c;
    	boolean pd  = true;
    }
  
    //利用正则匹配
    //return !iniString.matches(".*(.)(.*\\1).*");
   /* .*(.)(.*\\1).
    第1个  .  代表任意字符，后面的  *  代表 前面的任意字符有0个或多个
    第2个  .  也代表任意字符，但它被括号括起来了，括号代表它被捕获了，相当于被复制了，还没被粘贴
    第3个  .  也代表任意字符，后面的  *  代表 前面的任意字符有0个或多个
    \\第1个\代表转译符，\这个符号不能直接出现在表达式里，必须被\转译符后才能变成一个普通的字符\，也就是说第1个\是用来把第2个\变成一个普通字符\
    1就是1，没什么好说的
    最后1个  .  也是代表任意字符，它后面没跟着 * ，所以代表只有1个任意字符*/


    //数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
    //由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
    public int MoreThanHalfNum_Solution(int [] array) {
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
    	  
    	  if( n == 1)
    		  return array[0];
    	  
    	   n = n / 2;
    	for(int i = 0 ; i < n / 2 ; i++){
    		if((array[i] == array[ i + n / 2]))
    		return array[i];
    	}
   
    	return 0;
    	
    }
    
    //请实现一个算法，在不使用额外数据结构和储存空间的情况下，翻转一个给定的字符串(可以使用单个过程变量)。
    //给定一个string iniString，请返回一个string，为翻转后的字符串。保证字符串的长度小于等于5000。
    public String reverseString(String iniString) {

        return new StringBuilder(iniString).reverse().toString();
    }
    
}
