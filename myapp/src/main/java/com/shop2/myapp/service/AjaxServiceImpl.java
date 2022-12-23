package com.shop2.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop2.myapp.dto.CustomerDTO;
import com.shop2.myapp.model.AjaxMapper;

@Service
public class AjaxServiceImpl implements AjaxService {
	
	@Autowired
	AjaxMapper AjaxMapper;
	
	@Override
	public List<CustomerDTO> cusList() throws Exception {
		return AjaxMapper.cusList();
	}

	@Override
	public CustomerDTO getCus(String id) throws Exception {
		return AjaxMapper.getCus(id);
	}

	@Override
	public CustomerDTO logCus(String id, String pw) throws Exception {
		return AjaxMapper.logCus(id, pw);
	}
	
}