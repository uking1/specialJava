package ch07_exam;

import java.util.Objects;

public class Student07 {
	private String name;
	private double grade;

	public Student07() {
		this(null, 0.0);
	}

	public Student07(String name, double grade) {

		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public double getGrade() {
		return grade;
	}

	@Override
	public int hashCode() {

		return Objects.hash(name, grade);
	}

	@Override
	public boolean equals(Object obj) {
		Student07 stu = null;
		if (!(obj instanceof Student07)) {
			return false;
		}
		stu = (Student07) obj;
		if (this.name.equals(stu.name) && this.grade == stu.grade) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", grade=" + grade + "]";
	}

}
