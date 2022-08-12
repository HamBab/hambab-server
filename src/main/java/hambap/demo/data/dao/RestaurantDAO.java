package hambap.demo.data.dao;

import hambap.demo.data.entity.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantDAO {

    Optional<List<Restaurant>> findAll();
}
