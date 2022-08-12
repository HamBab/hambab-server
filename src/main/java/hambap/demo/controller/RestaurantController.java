package hambap.demo.controller;

import hambap.demo.data.entity.Restaurant;
import hambap.demo.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.openmbean.OpenDataException;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping("/all")
    public Optional<List<Restaurant>> findAll() {
        return restaurantService.findAll();
    }
}
