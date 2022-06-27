package Tokenizer;

import java.util.StringTokenizer;

public class TokenizerExample {

	public static void main(String[] args) {
		String str1 ="오늘의 날씨는 약간 쌀쌀하고 단풍이 무르익고 있습니다.";
		String str2 = "2022/06/27";
		
		System.out.println(str1);
		System.out.println(str2);
		
		StringTokenizer tokenizer1 = new StringTokenizer(str1);
		StringTokenizer tokenizer2 = new StringTokenizer(str2,"/");
		
		
		while(tokenizer1.hasMoreTokens()) {
			System.out.println(tokenizer1.nextToken());
		}
		while(tokenizer2.hasMoreTokens()) {
			System.out.println(tokenizer2.nextToken());
		}
		
		

	}

}
