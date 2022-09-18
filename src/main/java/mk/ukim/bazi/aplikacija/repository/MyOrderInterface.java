package mk.ukim.bazi.aplikacija.repository;

import mk.ukim.bazi.aplikacija.model.MyorderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MyOrderInterface extends JpaRepository<MyorderEntity, Integer> {
    List<MyorderEntity> findAllByAccId(Integer id);
}
