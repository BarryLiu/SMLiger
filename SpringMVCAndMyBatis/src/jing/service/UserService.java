package jing.service;

import java.util.List;

import jing.entity.TPermission;
import jing.entity.TUser;
import jing.entity.TUserExample;
import jing.entity.TUserExample.Criteria;
import jing.mapperdao.TGroupMapper;
import jing.mapperdao.TPermissionMapper;
import jing.mapperdao.TRoleMapper;
import jing.mapperdao.TUserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private TUserMapper tuserMapper;
	@Autowired
	private TPermissionMapper tperMapper;
	@Autowired
	private TGroupMapper tGroupMapper; 
	@Autowired
	private TRoleMapper tRoleMapper;
	
	public List<TUser> getAll(){
		return tuserMapper.selectByExample(null);
	}
	
	public TUser findById(Long id) {
		return tuserMapper.selectByPrimaryKey(id);
	}
	public TUser login(TUser tuser) {
		TUserExample example = new TUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(tuser.getUsername());
		criteria.andPwdEqualTo(tuser.getPwd());
		List<TUser> users = tuserMapper.selectByExample(example);
		if (users.size() > 0)
			return users.get(0);
		else
			return null;
	}
	
	public void settuserMapper(TUserMapper tuserMapper) {
		this.tuserMapper = tuserMapper;
	}

	public List<TPermission> getPermissions(TUser userInfo) {
		List<TPermission> permissions=null;
		if(userInfo.getIsAdmin()==1){//管理员所有权限
			permissions = tperMapper.selectByExample(null);
		}else{ //根据部门与角色获得权限
//			tGroupMapper.selectByExample(example );
			System.out.println("根据部门与角色得到权限");
		}
		return null;
	}

	public int saveOrModifyUser(TUser tUser) {
		int id = -1;
		if(tUser.getId()==null)
			id = tuserMapper.insertSelective(tUser);
		else
			id=	tuserMapper.updateByPrimaryKeySelective(tUser);
		return id;
	}
}
