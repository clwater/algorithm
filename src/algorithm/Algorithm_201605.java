package algorithm;

import java.util.Vector;

public class Algorithm_201605 {

	public static void main(String[] args) {


	}
	
	//Vector<String> help = new Vector<String>();
	
	//在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符的位置。若为空串，返回-1。位置索引从0开始
	public int FirstNotRepeatingChar(String str) {
		char[] c = str.toCharArray();
        int[] a = new int['z'];
        for (char d : c)
            a[(int) d]++;
        for (int i = 0; i < c.length; i++)
            if (a[(int) c[i]] == 1)
                return i;
        return -1;
	}
	
	
	
	//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
	public static boolean VerifySquenceOfBST(int[] sequence) {
        if(sequence==null||sequence.length==0)
            return false;
        int root=sequence[sequence.length-1];
        int i=0;
        for(;i<sequence.length-1;i++){
            if(sequence[i]>root){
                break;
            }
        }
        int j=i;
        for(;j<sequence.length-1;j++){
            if(sequence[j]<root)
                return false;
        }
        boolean left=true;
        boolean right=true;
        if(i>0){
            left=VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));
        }
        if(i<sequence.length-1)
            right=VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, sequence.length-1));
        return (left&&right);
 
    }
    
}
