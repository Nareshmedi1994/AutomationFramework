package practice;


public class GenericMethodPractice {
	//parameterization
	public static int add(int a, int b) {
		int c=a+b;
		return c;// return the output to caller
		
	}
	public static void main(String[] args) {
		//int sum=add(10,20);
		//System.out.println(sum);
		add(100,20);
		add(25,35);
		
	}

}
