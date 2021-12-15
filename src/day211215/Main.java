package day211215;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Student student = new Student("김민지", "1");

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(student);

		boolean flag = true;
		while(flag) {
			System.out.println("이름을 입력하세요.");
			System.out.print(">>");
			Scanner scanner = new Scanner(System.in);
			String name = scanner.nextLine();
			
			for (Student s : list) {				
				if (s.getName().equals(name)) {
					System.out.println(s.getNo());
				} else {
					System.out.println("없는 학생이름입니다.");
				}
			}
			
			System.out.println("계속 검색하겠습니까? y/n");
			System.out.print(">>");
			String yesNo = scanner.nextLine();
			if(yesNo.equals("n")) {
				flag = false;
			} 
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
