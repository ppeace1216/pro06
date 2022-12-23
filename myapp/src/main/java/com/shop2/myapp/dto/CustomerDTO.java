package com.shop2.myapp.dto;

import lombok.Data;

@Data
public class CustomerDTO {
	private String id;
	private String pw;
	private String name;
	private String email;
	private String tel;
	private String addr1;
	private String addr2;
	private String postcode;
	private String regdate;
	private int pt;
	private int grade;
	private int visited;
}
