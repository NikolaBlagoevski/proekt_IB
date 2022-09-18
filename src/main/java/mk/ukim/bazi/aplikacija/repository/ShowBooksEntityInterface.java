package mk.ukim.bazi.aplikacija.repository;

import mk.ukim.bazi.aplikacija.model.ShowBooksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowBooksEntityInterface extends JpaRepository<ShowBooksEntity, Integer> {
}
