package jing.service;

import jing.entity.TGroup;
import jing.mapperdao.TGroupMapper;
import jing.mapperdao.TPermissionMapper;
import jing.mapperdao.TRoleMapper;
import jing.mapperdao.TUserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class BaseUser {
	TUserMapper tUserMapper;
	TGroupMapper tGroupMapper;
	TRoleMapper tRoleMapper;
	TPermissionMapper tPermissionMapper;
	
	
}
