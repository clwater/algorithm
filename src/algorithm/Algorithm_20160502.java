package algorithm;

import java.util.*;

public class Algorithm_20160502 {

	public static void main(String[] args) {


	}
	
	
	//输入两个链表，找出它们的第一个公共结点。
	 public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

	        ListNode current1 = pHead1;
	        ListNode current2 = pHead2;
	 
	 
	        HashMap<ListNode, Integer> hashMap = new HashMap<ListNode, Integer>();
	        while (current1 != null) {
	            hashMap.put(current1, null);
	            current1 = current1.next;
	        }
	        while (current2 != null) {
	            if (hashMap.containsKey(current2))
	                return current2;
	            current2 = current2.next;
	        }
	 
	        return null;
	 }
    
	 
	 public class ListNode {
		    int val;
		    ListNode next = null;

		    ListNode(int val) {
		        this.val = val;
		    }
	 }
	 
	 public class TreeNode {
		    int val;
		    TreeNode left = null;
		    TreeNode right = null;

		    TreeNode(int val) {
		        this.val = val;
		    }
	 }
	 
	 
	 //X
	 public boolean IsBalanced_Solution(TreeNode root) {
	        if(root == null)
				return true;
			if( ( root.left == null && 
	           ( root.right.left == null && root.right.right == null)
					)||(root.right == null && 
	           ( root.left.left == null && root.left.right == null ) 
	          ))
					return false;
			return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right) ;
	    }
	 
	 //在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
	 //输入一个数组，求出这个数组中的逆序对的总数。
	 public int InversePairs(int [] array) {
		 int all = 0;
		 
		 for(int i = 0 ; i < array.length - 1; i++){
			 if(array[i] > array[ i + 1 ])
				 all++;
		 }
	     
		 
		 return all;
	 }
	 
}

