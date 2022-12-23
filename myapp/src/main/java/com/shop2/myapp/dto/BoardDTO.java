package com.shop2.myapp.dto;

import lombok.Data;

@Data
public class BoardDTO {
	public int bno;
	public String title;
	public String content;
	public String resdate;
	public int hits;
}
