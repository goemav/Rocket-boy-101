package pac;

import java.util.Scanner;

public class App02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第n项：");
		int n = sc.nextInt();
		int fn = num(n);
		System.out.println("斐波那契数列的第n项为：" + fn);
		
	}

	public static int num(int n) {
		int fn = 0;
		if (n == 1 || n == 2) {
			fn = 1;
		} else {
			fn = num(n - 1) + num(n - 2);
		}
		return fn;
	}

	
	
}
