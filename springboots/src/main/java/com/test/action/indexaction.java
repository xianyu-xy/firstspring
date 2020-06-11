package com.test.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.bean.userbean;
import com.test.service.uservice;
@Controller
public class indexaction {
	@Autowired uservice ser;
	@RequestMapping("/xy")
	public String index(Model model){
		List<userbean> list=ser.all();
		System.out.println(list);
		return "index";
	}

}
