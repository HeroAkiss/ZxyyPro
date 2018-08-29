package com.hch.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hch.dao.XtUserMapper;
import com.hch.model.VoUserPerson;
import com.hch.model.XtUser;
import com.hch.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private XtUserMapper xtUserDao;
	@Override
	public boolean deleteByPrimaryKey(String xtUserId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public XtUser selectByPrimaryKey(String xtUserId) {
		// TODO Auto-generated method stub
		XtUser user = xtUserDao.selectByPrimaryKey(xtUserId);
		return user;
	}

	@Override
	public XtUser selectByuser(XtUser user) {
		// TODO Auto-generated method stub
		
		return xtUserDao.selectByuser(user);
	}

	@Override
	public XtUser selByUsername(String xtUserName) {
		// TODO Auto-generated method stub
		return  xtUserDao.selByUsername(xtUserName);
	}

	@Override
	public List<XtUser> userXiaLa(String state) {
		// TODO Auto-generated method stub
		return xtUserDao.userXiaLa(state);
	}

	@Override
	public XtUser checkPwd(XtUser user) {
		// TODO Auto-generated method stub
		return xtUserDao.checkPwd(user);
	}

	@Override
	public boolean updatePwd(XtUser user) {
		// TODO Auto-generated method stub
		return xtUserDao.updatePwd(user)>0?true:false;
	}

	@Override
	public List<VoUserPerson> selectZBpeople(String state) {
		// TODO Auto-generated method stub
		return xtUserDao.selectZBpeople(state);
	}

	@Override
	public boolean updatePeState0(String xtuserId) {
		// TODO Auto-generated method stub
		return xtUserDao.updatePeState0(xtuserId)>0?true:false;
	}

	@Override
	public boolean updatePeState1(String xtuserId) {
		// TODO Auto-generated method stub
		return xtUserDao.updatePeState1(xtuserId)>0?true:false;
	}

}
