package jing.controller;

import javax.servlet.http.HttpServletRequest;

import jing.service.UserService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {
	private static final Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService service;
	
	@RequestMapping("login")
	public String login(HttpServletRequest request){
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		
		System.out.println("username:"+userName+"password:"+passWord);
		if(userName!=null|| "".equals(userName)){
			request.setAttribute("error_msg", "用户名不能为空");
			return "/index.jsp";
		}
		if(passWord!=null|| "".equals(passWord)){
			request.setAttribute("error_msg", "密码不能为空");
			return "../index.jsp";
		}
		
		if(userName.equals("admin")&& passWord.equals("123")){
			System.out.println("equals");
			return "/win7.jsp";
		}else{
			System.out.println("not equals");
			request.setAttribute("error_msg", "账号或密码错误");
			return "../win7.jsp";
		}
	}
	
	
}
