package jing.controller;

import java.util.List;

import jing.entity.TFund;
import jing.entity.TFundType;
import jing.service.ExpenseService;
import jing.util.TextUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mchange.v2.c3p0.util.TestUtils;

@Controller
@RequestMapping("/expense")
public class ExpenseController {
	@Autowired
	ExpenseService expenseService;
	
	@RequestMapping("/expenseList")
	public String expenseList(ModelMap map){
		List<TFund> funds = expenseService.selectFunds(null);
		map.put("funds", funds);
		String rowStr= TextUtil.getUserDataStr(funds);
		map.put("data", rowStr);
		return "/expense/expenseList.jsp";
	}
	@RequestMapping("/fundTypeList")
	public String fundTypeList(ModelMap map){
		List<TFundType> types = expenseService.selectFundTypes(null);
		map.put("types", types);
		map.put("data", TextUtil.getUserDataStr(types));
		return "/expense/fundTypeList.jsp";
	}
	
}
