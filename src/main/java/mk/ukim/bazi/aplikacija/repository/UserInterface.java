package mk.ukim.bazi.aplikacija.repository;

import mk.ukim.bazi.aplikacija.model.UserAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserInterface extends JpaRepository<UserAccountEntity, Integer> {
    Optional<UserAccountEntity> findByUsernameAndPassword(String username, String password);
}
