package com.showmual.model;

import org.springframework.stereotype.Component;

@Component("teammateVo")
public class TeammateVO {
	
	public int person_id;
	public String name;
	public String status;
	public String lunch;
	public String write_date;
	
	// 기본생성자 만들기
	public TeammateVO() {

	}
	
	// pub_date 빼고 생성자 만들기
	public TeammateVO(int person_id, String name, String status, String lunch) {
		super();
		this.person_id = person_id;
		this.name = name;
		this.status = status;
		this.lunch = lunch;
	}
	
	// Getter, Setter 만들기
	public int getPerson_id() {
		return person_id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLunch() {
		return lunch;
	}

	public void setLunch(String lunch) {
		this.lunch = lunch;
	}

	public String getWrite_date() {
		return write_date;
	}

}
