package ex;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
////		이클립스 단축키 : 컨트롤 + 쉬프트 + O = import java.util.Scanner; 적을거 다 적고 단축키 입력하면 자동으로 임포트 해줌
//		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine();
//		
////		문자열을 정수로 바꿈
//		int num = Integer.parseInt(input);
////		정수를 문자열로 바꿈
//		String str = num + "";
		
//		Ex2_10
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("두 자리 정수를 하나 입력해 주세요.>");
////		콘솔 입력에서 문자열을 한 라인을 입력 받음(엔터를 치기까지가 '한 라인'임)
//		String input = scanner.nextLine();
////		콘솔 입력에서 문자열을 공백까지 한 단어를 입력 받음(공백을 기준으로 하나만 출력)
////		예) 입력 : 222 222 222 출력 = 맨 앞에 있는 222만 출력
//		String input2 = scanner.next();
//		int num = Integer.parseInt(input);
//		
//		System.out.println("입력내용 : " + input);
//		System.out.printf("num = %d%n", num);
		
//		Ex2_11
//		short sMin = -32768, sMax = 32767;
//		char cMin = 0, cMax = 65535;
//		
//		System.out.println("sMin = " + sMin);
//		System.out.println("sMin - 1 = " + (short)(sMin-1));
//		System.out.println("sMax = " + sMax);
//		System.out.println("sMax + 1 = " + (short)(sMax+1));
//		System.out.println("cMin = " + (int)cMin);
//		System.out.println("cMin - 1 = " + (int)--cMin);
//		System.out.println("cMax = " + (int)cMax);
//		System.out.println("cMax + 1 = " + (int)++cMax);
		
//		Ex2_12
//		String str = "3";
//		
////		아스키코드 3 = 51, 0 = 48 즉, 51 - 48 = 3
//		System.out.println(str.charAt(0) - '0'); // '3' - '0'
//		System.out.println('3' - '0' + 1);
//		System.out.println(Integer.parseInt("3") + 1);
//		System.out.println("3" + 1);
////		아스키코드 0 = 48 즉, 3 + 48 = 51
////		자바는 char을 곱해주면 자동적으로 아키스코드로 바꿔줌
////		아스키코드번호 51 = 3
//		System.out.println((char)(3 + '0'));
		
//		연습문제 2-8
		int x = 1;
		int y = 2;
		int z = 3;
		
		int tmp = x;
		int tmp2 = y;
		int tmp3 = z;
		x = tmp2;
		y = tmp3;
		z = tmp;

//		강사님 풀이
//		int tmp = x;
//		x = y;
//		y = z;
//		z = tmp;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}

}
