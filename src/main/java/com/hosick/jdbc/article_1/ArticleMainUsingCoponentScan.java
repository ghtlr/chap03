package com.hosick.jdbc.article_1;

import com.hosick.jdbc.article.Article;

/**
 * ArticleService를 테스트하는 main
 * 
 * @author 
 */
public class ArticleMainUsingSpring {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"article.xml");
		ArticleService articleService = context.getBean("articleService",
				ArticleService.class);
		context.close();

		articleService.addArticle();
		articleService.listArticles();
	}

}
