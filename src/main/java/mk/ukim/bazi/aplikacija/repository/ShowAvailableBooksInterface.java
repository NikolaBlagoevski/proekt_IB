package mk.ukim.bazi.aplikacija.repository;

import mk.ukim.bazi.aplikacija.model.ShowAvailableBooksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowAvailableBooksInterface extends JpaRepository<ShowAvailableBooksEntity, Integer> {
}
