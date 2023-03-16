package kr.codesqaud.cafe.repository;

import kr.codesqaud.cafe.article.Article;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public void writeArticle(Article article) {
        articleRepository.save(article);
    }

    public Optional<Article> findArticleByWriter(String writer) {
        return articleRepository.findArticleByWriter(writer);
    }

    public List<Article> findAllArticle() {
        return articleRepository.findAllArticle();
    }
}
