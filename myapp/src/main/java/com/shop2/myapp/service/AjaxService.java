package com.shop2.myapp.service;

import java.util.List;

import com.shop2.myapp.dto.CustomerDTO;

public interface AjaxService {
	public List<CustomerDTO> cusList() throws Exception;
	public CustomerDTO getCus(String id) throws Exception;
	public CustomerDTO logCus(String id, String pw) throws Exception;
}
