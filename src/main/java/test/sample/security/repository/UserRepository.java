package test.sample.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.sample.security.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
