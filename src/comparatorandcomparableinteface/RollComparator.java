package comparatorandcomparableinteface;

import java.util.Comparator;

public class RollComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s2.getRollno() - s1.getRollno();
	}
}
