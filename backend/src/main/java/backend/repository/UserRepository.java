package backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import backend.model.User;

@Component
public interface UserRepository extends JpaRepository<User, Long>{

	User findByName(String name);

}
