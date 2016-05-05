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
	
    
}
