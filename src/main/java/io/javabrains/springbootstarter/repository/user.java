package io.javabrains.springbootstarter.repository;

import javax.persistence.*;

@Entity
@Table(name = "user_tbl")
public class user {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private Integer age;
	
	public user() {
	}
	
	public user(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User{"+
				", name='" + name + '\''+
				", age=" + age +
				'}';
	}
}
