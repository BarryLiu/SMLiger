package jing.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jing.entity.TUser;
import jing.entity.User;
import jing.service.UserService;
import jing.util.TextUtil;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {
	private static final Logger logger = Logger.getLogger(UserController.class);
	private String result = "";
	private boolean res = true;
	private Object obj = null;
	@Autowired
	private UserService userService;
	
	@RequestMapping("login")
	public String login(HttpServletRequest request){
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		System.out.println("username:"+userName+"password:"+passWord);
		
		
		System.out.println("treedata: "+TextUtil.getTreeData());
		logger.debug("username:"+userName+"password:"+passWord);
		
		if(userName==null|| "".equals(userName)){
			request.setAttribute("error_msg", "用户名不能为空");
			return "/index.jsp";
		}
		if(passWord==null|| "".equals(passWord)){
			request.setAttribute("error_msg", "密码不能为空");
			return "/index.jsp";
		}
		
		TUser user = new TUser();
		user.setUsername(userName);
		user.setPwd(passWord);
		TUser userInfo= userService.login(user);
//		List<User> users = userService.findUsers();
//		User userInfo = users.get(0);
		if(userInfo != null ){
			request.getSession().setAttribute("treeData", TextUtil.getTreeData());	
			request.getSession().setAttribute("userInfo", userInfo);
		}else{
			request.getSession().setAttribute("treeData", TextUtil.getTreeData());	
		}
		
		
		
		if(userName.equals("admin")&& passWord.equals("123")){
			String view_style = request.getParameter("view_style");
			System.out.println("equals"+Integer.valueOf(view_style).equals(1));
			if(Integer.valueOf(view_style).equals(1)){
				return "/main.jsp";
			}else{
				return "/win7.jsp";
			}
		}else{
			System.out.println("not equals");
			request.setAttribute("error_msg", "账号或密码错误");
			return "/index.jsp";
		}
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
