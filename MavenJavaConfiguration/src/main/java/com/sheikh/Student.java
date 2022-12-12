package com.sheikh;

import org.springframework.stereotype.Component;

public class Student {
	private Teacher teacher;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Teacher teacher) {
		super();
		this.teacher = teacher;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void study() {
		this.teacher.show();
	}
}
