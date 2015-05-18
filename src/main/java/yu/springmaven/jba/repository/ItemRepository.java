package yu.springmaven.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import yu.springmaven.jba.entity.Item;


public interface ItemRepository extends JpaRepository<Item, Integer> {

}
