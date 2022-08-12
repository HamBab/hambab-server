package hambap.demo.data.repository;

import hambap.demo.data.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    @Query(value = "select r from Restaurant r where r.category = :category")
    public Optional<List<Restaurant>> findByCategory(@Param("category") String category);
}
