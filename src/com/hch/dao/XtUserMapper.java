package com.hch.dao;

import com.hch.model.VoUserPerson;
import com.hch.model.XtUser;
import com.hch.model.XtUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtUserMapper {

	XtUser selByUsername(String xtUserName);

	int deleteByPrimaryKey(String xtUserId);

	XtUser selectByuser(XtUser user);

	XtUser selectByPrimaryKey(String xtUserId);

	// 通过状态显示用户下拉
	List<XtUser> userXiaLa(String state);

	XtUser checkPwd(XtUser user);

	int updatePwd(XtUser user);

	List<VoUserPerson> selectZBpeople(String state);

	int updatePeState0(String xtuserId);

	int updatePeState1(String xtuserId);

}