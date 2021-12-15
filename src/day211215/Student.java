package day211215;



public class Student {
	// 이름
	private String name;
	// 학번
	private String no;

	// 생성자
	public Student() {
		this.name = "";
		this.no = "";
	}

	// 생성자
	public Student(String name, String no) {
		this.name = name;
		this.no = no;
	}
	
	// 겟터,셋터

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}


}
