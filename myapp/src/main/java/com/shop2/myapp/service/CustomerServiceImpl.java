package com.shop2.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop2.myapp.dto.CustomerDTO;
import com.shop2.myapp.model.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerMapper customerMapper;
	
	@Override
	public List<CustomerDTO> cusList() throws Exception {
		return customerMapper.cusList();
	}

	@Override
	public CustomerDTO cusDetail(String id) throws Exception {
		return customerMapper.cusDetail(id);
	}

	@Override
	public CustomerDTO loginCus(String id, String pw) throws Exception {
		return customerMapper.loginCus(id, pw);
	}

	@Override
	public void insertCus(CustomerDTO cus) throws Exception {
		customerMapper.insertCus(cus);
		
	}

	@Override
	public void updateCus(CustomerDTO cus) throws Exception {
		customerMapper.updateCus(cus);
		
	}

	@Override
	public void deleteCus(String id) throws Exception {
		customerMapper.deleteCus(id);
		
	}
	
}
