package yu.springmaven.jba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import yu.springmaven.jba.entity.Blog;
import yu.springmaven.jba.entity.Item;


public interface ItemRepository extends JpaRepository<Item, Integer> {
	
	List<Item> findByBlog(Blog blog);

}
