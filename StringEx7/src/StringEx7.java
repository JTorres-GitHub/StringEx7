import java.util.Scanner;

public class StringEx7 {
	public static String firstHalf(String str){
		String half1;
		
		half1 = str.substring(0, str.length() / 2);
		
		return half1;
		
	}
	
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		String inputStr;
		
		System.out.println("Enter a string: ");
		inputStr = input.nextLine();
		
		System.out.println(firstHalf(inputStr));
		
		input.close();
	}
}
