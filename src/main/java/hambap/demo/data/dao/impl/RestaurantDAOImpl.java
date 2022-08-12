package hambap.demo.data.dao.impl;

import hambap.demo.data.dao.RestaurantDAO;
import hambap.demo.data.entity.Restaurant;
import hambap.demo.data.repository.RestaurantRepository;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Component
public class RestaurantDAOImpl implements RestaurantDAO {

    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantDAOImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public Optional<List<Restaurant>> findByCategory(String category) {
        Optional<List<Restaurant>> restaurantList = restaurantRepository.findByCategory(category);
        return restaurantList;
    }
}
