package com.hosick.jdbc.spring;

public class MemberService {
	MemberDao memberDao;
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public void registerMember() {
		memberDao.getMember();
	}

}
