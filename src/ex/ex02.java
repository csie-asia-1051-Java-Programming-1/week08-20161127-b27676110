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
		System.out.println("幾進制轉幾進制 再輸入數字");
		int a = scn.nextInt();
		int b = scn.nextInt();
		String str = scn.next();
		char[] data = str.toCharArray();
		int c = data.length;
		int sum = 0;
		int d = 0;

		for (int i = 0; i < data.length; i++) {
			d = data[i] - 48;
			sum = sum + (d * ((int) Math.pow(a, c - 1)));
			c--;
		}
		int x = 0;
		int sum2 = 0;

		
		int i = 1;
		while (sum > 0) {
			x = (sum % b);
			sum = sum / b;
			sum2 = sum2 + x * i;
			i = i * 10;

		}
		System.out.print(sum2);

	}
}
