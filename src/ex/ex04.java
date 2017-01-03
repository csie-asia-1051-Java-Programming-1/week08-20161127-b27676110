package ex;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		calculator haha = new calculator("compute", null, null);
		int a = scn.nextInt();	
		
		char k = scn.next().charAt(0);
		int b = scn.nextInt();
		System.out.println(haha.compute(a,k,b));
	}
}
		class calculator{
			private String integerA;
			private String integerB;
			private String symbol;
			public calculator(String integer1,String integer2,String symbol1){
				integerA = integer1;
				integerB = integer2;
				symbol = symbol1;
				
				
			}
			public float compute(int a1,char i,int b1){
				float result = 0;
				switch(i){
				case'+':
					result = a1 + b1;
					break;
				case'-':
					result = a1 - b1;
					break;
				case'*':
					result = a1*b1;
					break;
				case'/':
					result = a1/b1;
					break;
				}
				return result;
			}
			
		
		
		
		}

	




