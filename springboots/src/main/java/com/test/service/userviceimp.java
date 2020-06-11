package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bean.userbean;
import com.test.dao.userdao;
@Service
public class userviceimp  implements uservice{
	@Autowired 
	private userdao dao;

	@Override
	public List<userbean> all() {
		List<userbean> list=dao.alluser();
		return list;
	
	}

}
