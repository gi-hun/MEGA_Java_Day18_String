/*
 * # 문자열 [입력받기]
 * . 숫자나 영어단어 입력 시 커서를 옮길 필요가 없다.
 * . 단, 한글 입력 시 반드시 커서를 끝으로 옮긴 후 작성해야 한다.
 */
package day_18;

import java.util.Scanner;

public class StringEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요: ");
		String name = sc.next();
		
		System.out.println("name = " + name);
	}
}
