package tr.afu.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import tr.afu.domain.User;



public interface UserDao extends JpaRepository<User, Integer> {
	User findByUserName(String userName);

}