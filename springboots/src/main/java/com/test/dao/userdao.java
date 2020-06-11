package com.test.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.bean.userbean;
@Repository
public interface userdao {
	List<userbean> alluser();

}
