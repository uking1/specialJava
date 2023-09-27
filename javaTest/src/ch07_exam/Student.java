package ch07_exam;

import java.util.Objects;

public class Student {
	private String name;
	private String major;
	private int id;
	private double gpa;

	public Student() {
		this(null, null, 0, 0.0);
	}

	public Student(String name, int id) {
		this(name, null, id, 0.0);
	}

	public Student(String name, String major, int id, double gpa) {
		super();
		this.name = name;
		this.major = major;
		this.id = id;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}

	public int getId() {
		return id;
	}

	public double getGpa() {
		return gpa;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", major=" + major + ", id=" + id + ", gpa=" + gpa + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.id);
	}

	@Override
	public boolean equals(Object obj) {
		Student stn = null;
		if (!(obj instanceof Student)) {
			return false;
		}
		stn = (Student) obj;
		if (this.name.equals(stn.name) && this.id == stn.id) {
			return true;
		}
		return false;
	}

}
