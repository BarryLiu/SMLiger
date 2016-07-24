package jing.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jing.entity.TPermission;
import jing.entity.TUser;
import jing.service.UserService;
import jing.util.Result;
import jing.util.TextUtil;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@Controller
@RequestMapping("/user")
public class UserController {
	private static final Logger logger = Logger.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,String userName,String passWord){
		Result.res  = true;
		logger.debug("username:"+userName+"password:"+passWord);
		
		if(userName==null|| "".equals(userName)){
			Result.res = Result.RES_FAIL;
			Result.msg += "用户名不能为空";
		}
		if(passWord==null|| "".equals(passWord)){
			Result.res = Result.RES_FAIL;
			Result.msg += " 密码不能为空";
		}
		TUser userInfo = null;
		if(Result.res){
			TUser user = new TUser();
			user.setUsername(userName);
			user.setPwd(passWord);
			userInfo= userService.login(user);
		}
		if(userInfo != null ){
			List<TPermission> permissions = userService.getPermissions(userInfo);
			System.out.println("treedata: "+TextUtil.getTreeData());
 			request.getSession().setAttribute("treeData", TextUtil.getTreeData());	
			request.getSession().setAttribute("userInfo", userInfo);
			request.getSession().setAttribute("userPermissions", permissions);
		}else{
			Result.res = Result.RES_FAIL;
			Result.msg = "账号或密码错误";
		}
		
		if(Result.res){
			String view_style = request.getParameter("view_style");
			System.out.println("equals:"+Integer.valueOf(view_style).equals(1));
			if(Integer.valueOf(view_style).equals(1)){
				return "/main.jsp";
			}else{
				return "/win7.jsp";
			}
		}else{
			request.setAttribute("error_msg",Result.msg);
			return "/index.jsp";
		}
	}
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
		request.getSession().removeAttribute("userInfo");
		request.getSession().removeAttribute("userPermissions");
		
		return "/index.jsp";
	}
	
	@RequestMapping("/userList")
	public String userList(HttpServletRequest request){
		List<TUser> users = userService.getAll();
		System.out.println("users: "+users.size());
//		System.out.println(TextUtil.getUserData());
		request.setAttribute("data",TextUtil.getUserDataStr(users));
		return "/user/userList.jsp";
	}
	//返回json 格式的数据 
	@ResponseBody
	@RequestMapping("/userListData")
	public List<TUser> userListData(HttpServletRequest request){
		List<TUser> users = userService.getAll();
		System.out.println("users: "+users.size());
		System.out.println(TextUtil.getUserData());
		request.setAttribute("data",TextUtil.getUserData());
		return users;//"/user/userList.jsp";
	}
	/**
	 * 插入或转修改   完成后跳转到userList 页面
	 * @param request
	 * @param tUser
	 * @return
	 */
	public String saveOrmodifyUser(HttpServletRequest request , TUser tUser){
		int id = userService.saveOrModifyUser(tUser);
		return userList(request);
	}
}
