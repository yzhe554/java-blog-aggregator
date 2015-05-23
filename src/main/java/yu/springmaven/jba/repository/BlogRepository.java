package yu.springmaven.jba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import yu.springmaven.jba.entity.Blog;
import yu.springmaven.jba.entity.User;


public interface BlogRepository extends JpaRepository<Blog, Integer> {
	
	List<Blog> findByUser(User user);


}
