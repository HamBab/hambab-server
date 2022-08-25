package hambap.demo.controller;

import hambap.demo.data.entity.Group;
import hambap.demo.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequiredArgsConstructor
@RequestMapping("/group")
public class GroupController {

    private final GroupService groupService;


    @GetMapping("/update/{id}/{name}")
    public String updateGroup(@PathVariable String name, @PathVariable Long id) {
        return groupService.updateGroup(name, id);
    }

    @GetMapping("")
    public Optional<List<Group>> getAllGroups() {
        return groupService.findAllGroups();
    }

    @GetMapping("/new/{restaurantId}/{leaderId}")
    public Optional<Group> createGroup(@PathVariable Long restaurantId, @PathVariable Long leaderId) {
        return groupService.createGroup(restaurantId, leaderId);
    }

    @GetMapping("/{id}")
    public Optional<Group> findGroupById(@PathVariable Long id) {
        return groupService.findGroupById(id);
    }
}
