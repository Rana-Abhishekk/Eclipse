package Stud.com.task.dto;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id ;
	private String name;
	private String[] sub ;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getSub() {
		return sub;
	}

	public void setSub(String[] sub) {
		this.sub = sub;
	}
	
	public Student() {
		super();
	}

	public Student(int id, String name, String[] sub) {
		super();
		this.id = id;
		this.name = name;
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sub=" + Arrays.toString(sub) + "]";
	}

}

