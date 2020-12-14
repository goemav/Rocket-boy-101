package pac;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
		for (long i = 0; i <= 2147483647; i++) {
			if (i%2==1) {
				sum+=i;
			}	
			
		}
		System.out.println("奇数和为"+sum);
	}

}
