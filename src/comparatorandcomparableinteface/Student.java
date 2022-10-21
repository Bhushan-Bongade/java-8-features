package comparatorandcomparableinteface;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	private int rollno;
	private String grade;
	
	public Student(String name, int age, int rollno, String grade) {
		super();
		this.name = name;
		this.age = age;
		this.rollno = rollno;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", grade=" + grade + "]";
	}
	
	@Override
	public int compareTo(Student that) {
		return this.rollno - that.rollno;
	}
	
}


