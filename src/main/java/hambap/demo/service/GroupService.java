package hambap.demo.service;

import hambap.demo.data.entity.Group;

import java.util.List;
import java.util.Optional;

public interface GroupService {

    String updateGroup(String name, Long id);
    String deleteGroup(Long id);
    Optional<List<Group>> findAllGroups();
    Optional<Group> createGroup(Long restaurantId, Long leaderId);
    Optional<Group> findGroupById(Long id);

}
