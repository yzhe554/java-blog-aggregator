package yu.springmaven.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import yu.springmaven.jba.entity.Blog;


public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
