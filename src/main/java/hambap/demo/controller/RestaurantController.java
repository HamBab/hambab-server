package hambap.demo.controller;

import hambap.demo.data.entity.Restaurant;
import hambap.demo.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurants")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping("/{category}")
    public Optional<List<Restaurant>> findByCategory(@PathVariable String category) {
        return restaurantService.findByCategory(category);
    }

    @GetMapping("/search/{name}")
    public Optional<List<Restaurant>> search(@PathVariable String name) {
        return restaurantService.search(name);
    }

    @GetMapping("/restaurant/{id}")
    public Optional<Restaurant> getRestaurantInfo(@PathVariable Long id) {
        return restaurantService.getRestaurantInfo(id);
    }
}
