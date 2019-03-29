package com.hosick.jdbc.spring;

public class ArticleService {
	MemberDao memberDao;
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void addArticle() {
		memberDao.getMember();
	}

}
