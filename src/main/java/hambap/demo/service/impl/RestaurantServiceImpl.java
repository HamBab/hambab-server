package hambap.demo.service.impl;

import hambap.demo.data.dao.RestaurantDAO;
import hambap.demo.data.entity.Restaurant;
import hambap.demo.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantDAO restaurantDAO;

    @Autowired
    public RestaurantServiceImpl(RestaurantDAO restaurantDAO) {
        this.restaurantDAO = restaurantDAO;
    }

    @Override
    public Optional<List<Restaurant>> findAll() {

        Optional<List<Restaurant>> restaurantList = restaurantDAO.findAll();
        return restaurantList;
    }
}
