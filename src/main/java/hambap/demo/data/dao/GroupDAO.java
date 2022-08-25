package hambap.demo.data.dao;

import hambap.demo.data.entity.Group;

import java.util.Optional;

public interface GroupDAO {

    Optional<Group> save(Group group);
}


