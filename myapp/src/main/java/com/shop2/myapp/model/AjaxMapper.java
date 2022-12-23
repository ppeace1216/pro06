package com.shop2.myapp.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shop2.myapp.dto.CustomerDTO;

@Mapper
public interface AjaxMapper {
	public List<CustomerDTO> cusList() throws Exception;
	public CustomerDTO getCus(String id) throws Exception;
	public CustomerDTO logCus(String id, String pw) throws Exception;
}
