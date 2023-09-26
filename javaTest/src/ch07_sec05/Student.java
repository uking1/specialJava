package ch07_sec05;

import java.util.Objects;

public class Student {
	private int id;
	private String tel;
	
	public Student() {
		this(0,null);
	}
	
	
	public Student(int id,String tel) {
		this.id = id;
		this.tel = tel;
	}

	
	public int getId() {
		return id;
	}


	public String getTel() {
		return tel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id+tel);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Student stu = (Student)obj;
		if(this.id == stu.id && this.tel.equals(stu.tel) ) {
			return true;
		}else {
			return false;
		}
		
	}
	

	@Override
	public String toString() {
		return "[id=" + id + ", tel=" + tel + "]";
	}
	
	
	
}
