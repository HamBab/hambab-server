package hambap.demo.data.dao;

import hambap.demo.data.entity.Restaurant;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RestaurantDAO {

    Optional<List<Restaurant>> findByCategory(String category);
    Optional<List<Restaurant>> search(String name);
    Optional<Restaurant> getRestaurantInfo(Long id);
}
