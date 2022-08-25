package hambap.demo.service;

import hambap.demo.data.entity.Group;

import java.util.List;
import java.util.Optional;

public interface GroupService {

    Optional<List<Group>> findAllGroups();
    Optional<Group> createGroup(Long restaurantId, Long leaderId);
}
