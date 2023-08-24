package juni.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import juni.springbootdeveloper.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}

