package ex;

/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請先輸入幾進制在輸入數字");
		
		int b = scn.nextInt();
		int n = scn.nextInt();
		fun(b, n);
	}

	public static void fun(int b, int n) {

		int sum = 0, sum2 = 0, c = 1;
		while (n > 0) {
			sum = n % b;
			n = n / b;
			sum2 = sum2 + (sum * c);
			c = c * 10;

		}
		System.out.println(sum2);

	}
}