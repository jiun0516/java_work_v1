package ch01;

public class MainTest1 {
	
	static int intAdd(int n1, int n2, int n3) {
		int result = n1 + n2 + n3;
		return result;
	}
	static double doubleAdd(int n1, int n2, int n3) {
		double result = n1 + n2 + n3;
		return result;
	}
	static void printArticle(String article) {
		System.out.println(article);
	}
	
	public static void main(String[] args) {
		int sum = intAdd(1, 5, 4);
		System.out.println(sum);
		
		System.out.println("------------------------");
		
		double sum1 = doubleAdd(6, 5, 7);
		System.out.println(sum1);
		
		System.out.println("------------------------");
		
		printArticle("아~메~리~카~노");
	}

}
