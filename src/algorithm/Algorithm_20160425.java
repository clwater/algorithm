package algorithm;

import java.util.*;

import com.sun.corba.se.impl.orbutil.graph.Node;

public class Algorithm_20160425 {

	public static void main(String[] args) {


	}
	
	Stack<Integer> data = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    Integer temp = null;
    public void push(int node) {
        if(temp != null){
            if(node <= temp ){
                temp = node;
                min.push(node);
            }
            data.push(node);
        }else{
            temp = node;
            data.push(node);
            min.push(node);
        }
    }
    
    public void pop() {
        int num = data.pop();
        int num2 = min.pop();
        if(num != num2){
           min.push(num2); 
        }
    }
    
    public int top() {
        int num = data.pop();
        data.push(num);
        return num;
    }
    
    public int min() {
        int num = min.pop();
        min.push(num);
        return num;
    }

    //输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
    //假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序
    //列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
    
    
    /*模拟堆栈操作：将原数列依次压栈，栈顶元素与所给出栈队列相比，如果相同则出栈，
	如果不同则继续压栈，直到原数列中所有数字压栈完毕。
	检测栈中是否为空，若空，说明出栈队列可由原数列进行栈操作得到。否则，说明出栈队列不能由原数列进行栈操作得到。
     */

    public boolean IsPopOrder(int [] pushA,int [] popA) {
    	 if(pushA.length==0||popA.length==0)
             return false;
    	 Stack<Integer> stack = new Stack<Integer>();
    	 int index = 0 ;
    	 for(int i = 0 ; i < pushA.length ; i++){
    		 stack.push(pushA[i]);
    		 while(!stack.empty() && stack.peek() == popA[index] ){
    			 stack.pop();
    			 ++index;
    		 }
    	 }
    	 
    	 if(stack.empty())
    		 return true;
         return false;
    }
    
    
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    
    //从上往下打印出二叉树的每个节点，同层节点从左至右打印。

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    	if(root == null){
    		return null;
    	}
    	
    	LinkedList<TreeNode> queue = new LinkedList<TreeNode>() ;
        ArrayList<Integer> array = new ArrayList<Integer>() ;
         
       
        
        queue.offer(root);
        while(!queue.isEmpty()){
        	TreeNode t = queue.poll();
        	array.add(t.val);
        	
        	if(t.left!=null){
        		queue.offer(t.left);
        	}
        	if(t.right!=null){
        		queue.offer(t.right);
        	}
        	
        }

    	return array;
    }
    

    
    
    
}

