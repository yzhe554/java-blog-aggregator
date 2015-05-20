package yu.springmaven.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import yu.springmaven.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByName(String name);

}
