package hambap.demo.controller;

import hambap.demo.data.entity.Restaurant;
import hambap.demo.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.openmbean.OpenDataException;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurants")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping("/{category}")
    public Optional<List<Restaurant>> findByCategory(String category) {
        return restaurantService.findByCategory(category);
    }
}
