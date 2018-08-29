package com.hch.service;

import java.util.List;

import com.hch.model.VoUserPerson;
import com.hch.model.XtUser;

public interface UserService {

	    boolean deleteByPrimaryKey(String xtUserId);
	    XtUser selectByPrimaryKey(String xtUserId);
	    XtUser  selectByuser(XtUser user);
	    XtUser selByUsername(String xtUserName);
	    List<XtUser> userXiaLa(String state);
	    XtUser  checkPwd(XtUser user);
	    boolean updatePwd(XtUser user);
	    List<VoUserPerson> selectZBpeople(String state);
	    boolean updatePeState0(String xtUserId);
	    boolean updatePeState1(String xtUserId);
}
