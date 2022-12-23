package com.shop2.myapp.service;

import java.util.List;

import com.shop2.myapp.dto.CustomerDTO;

public interface CustomerService {
	public List<CustomerDTO> cusList() throws Exception;
	public CustomerDTO cusDetail(String id) throws Exception;
	public CustomerDTO loginCus(String id, String pw) throws Exception;
	public void insertCus(CustomerDTO cus) throws Exception;
	public void updateCus(CustomerDTO cus) throws Exception;
	public void deleteCus(String id) throws Exception;
}
