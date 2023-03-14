package digitToKor;

// 사용자가 0~9 사이의 수를 입력하면 숫자를 한글로 출력할 수 있도록 하세요.

import java.util.Scanner;
public class DigitToKor02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		String result = "";
		
		System.out.println("0~9 사이의 숫자를 출력하세요");
		n = sc.nextInt();
		
		if (n == 0) 
			result = "영";
		else if(n == 1)
			result = "일";
		else if(n == 2)
			result = "이";
		else if(n == 3)
			result = "삼";
		else if(n == 4)
			result = "사";
		else if(n == 5)
			result = "오";
		else if(n == 6)
			result = "육";
		else if(n == 7)
			result = "칠";
		else if(n == 8)
			result = "팔";
		else if(n == 9)
			result = "구";

		System.out.println(result);
		
	}

}
