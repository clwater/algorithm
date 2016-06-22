package algorithm;

import java.util.Vector;

public class Algorithm_20160621 {

	public static void main(String[] args) {


	}
	
	/*请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间
	 * 存放新增的字符，并且知道字符串的真实长度(小于等于1000)，同时保证字符串由大小写的英文字母组成。
		给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string。*/
	 public String replaceSpace(String iniString, int length) {
		 		
	       return iniString.replace(" ", "%20");
	    }
	 
	 /*有一副由NxN矩阵表示的图像，这里每个像素用一个int表示，请编写一
	  * 个算法，在不占用额外内存空间的情况下(即不使用缓存矩阵)
	  * ，将图像顺时针旋转90度。给定一个NxN的矩阵，和矩阵的阶数N,
	  * 请返回旋转后的NxN矩阵,保证N小于等于500，图像元素小于等于256。
	  * 测试样例：[[1,2,3],[4,5,6],[7,8,9]],3
	  * 返回：[[7,4,1],[8,5,2],[9,6,3]]*/
	
	 public int[][] transformImage(int[][] mat, int n) {
		 int temp;
		 for(int i=0;i<n/2;i++){
		     for(int j=i;j<n-1-i;j++){
		         temp = mat[i][j];
		         mat[i][j]=mat[n-j-1][i];
		         mat[n-j-1][i]=mat[n-i-1][n-j-1];
		         mat[n-i-1][n-j-1]=mat[j][n-i-1];
		         mat[j][n-i-1]=temp;
		     }
		  
		 }
	       return mat;
	    }
}
