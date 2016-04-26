package algorithm;

import java.util.Vector;

public class Algorithm_20160426 {

	public static void main(String[] args) {

		//System.out.println("aa");
	}
	
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val) {
	        this.val = val;
	    }
	};
	
	//输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
	public int TreeDepth(TreeNode pRoot)
    {
	
		if(pRoot == null)
            return 0;
		return  Math.max(1+TreeDepth(pRoot.left),  1+TreeDepth(pRoot.right));
    } 
	
//	//输入一棵二叉树，判断该二叉树是否是平衡二叉树。
//	public boolean IsBalanced_Solution(TreeNode root) {
//		if(root == null)
//			return true;
//		if(  root.left == null && ( root.right.left == null && root.right.right == null)
//				||root.right == null && ( root.left.left == null && root.left.right == null ) )
//				return false;
//		return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right) ;
//	 }

//		//输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
//		//例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
//	    public String PrintMinNumber(int [] numbers) {
//
//	    }
	//把只包含因子2、3和5的数称作丑数（Ugly Number）。
	//例如6、8都是丑数，但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
	public int GetUglyNumber_Solution(int index) {
		int num = 1;
		for(int i = 0 ; i < index ; i++){
			
			boolean pd = true;
			for(int j = 4 ; j < i ; j++){
				
				if( j != 5){
					if( num % j == 0){
						pd = false; 
						j = i;
					}
				} 
			}
			if( pd )
				num++;
			pd = true;
			
			
		}
			
			
        return num;
    }
	
	
	
	
}
