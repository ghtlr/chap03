package com.hosick.jdbc.article_1;
import java.util.List;

import com.hosick.jdbc.article.ArticleDao;
public class ArticleService throws DuplicateMemberException {
	
	ArticleDao articleDao;
	
	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	/**
	 * 글 목록
	 */
	public void listArticles() {
		List<Article> articles = articleDao.listArticles();
		System.out.println(articles);
	}

	/**
	 * 글 조회
	 */
	public void getArticle() {
		Article article = articleDao.getArticle("3");
		System.out.println(article);
	}

	/**
	 * 글 등록
	 */
	public void addArticle() {
		Article article = new Article();
		article.setTitle("나혼자산다’ 기안84 논란…예의를 잊었나, 예의를 몰랐나 ");
		article.setContent(
				" ‘나 혼자 산다’ 기안84의 이해할 수 없는 행동이 도마 위에 올랐다. “이제 보니 민폐였다”고 자신도 말했지만, 때는 이미 늦었다. 기본 예의조차 잊은 그의 행동은 이미 기안84를 논란의 중심에 뒀다.");
		article.setUserId("1");
		article.setName("최호식");
		if (articleDao.addArticle(article) > 0)
			System.out.println("글을 추가했습니다.");
		else
			System.out.println("글을 추가하지 못했습니다.");
	}

	/**
	 * 글 수정
	 */
	public void updateArticle() {
		Article article = new Article();
		article.setArticleId("7");
		article.setTitle("This is modified title.");
		article.setContent("This is modified content");
		if (articleDao.updateArticle(article) > 0)
			System.out.println("글을 수정했습니다.");
		else
			System.out.println("글을 수정하지 못했습니다.");
	}

	/**
	 * 글 삭제
	 */
	public void deleteArticle() {
		if (articleDao.deleteArticle("8") > 0)
			System.out.println("글을 삭제했습니다.");
		else
			System.out.println("글을 삭제하지 못했습니다.");
	}
}
