package hambap.demo.service;

import hambap.demo.data.entity.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {

    Optional<List<Restaurant>> findAll();
}
