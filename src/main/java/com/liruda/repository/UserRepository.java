package com.liruda.repository;

/**
 * Created with IntelliJ IDEA.
 * User: 020919
 * Date: 10/17/13
 * Time: 5:02 PM
 * To change this template use File | Settings | File Templates.
 */
import com.liruda.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
