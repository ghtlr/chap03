package com.hosick.jdbc.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArticleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("chap02.xml");
		ArticleService articleService = ctx.getBean("articleService", com.hosick.jdbc.spring.ArticleService.class);
		MemberService memberService = ctx.getBean("memberService", com.hosick.jdbc.spring.MemberService.class);

		articleService.addArticle();
		memberService.registerMember();

		ctx.close();

	}

}
