package jing.service;

import java.util.List;

import jing.entity.TFund;
import jing.entity.TFundType;
import jing.mapperdao.TFundMapper;
import jing.mapperdao.TFundTypeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

	@Autowired
	private TFundMapper tFundMapper;
	@Autowired
	private TFundTypeMapper tFundTypeMapper;

	public List<TFund> selectFunds(TFund tFund) {

		return tFundMapper.selectByExample(null);
	}

	public List<TFundType> selectFundTypes(TFundType tFundType) {

		return tFundTypeMapper.selectByExample(null);
	}

}
