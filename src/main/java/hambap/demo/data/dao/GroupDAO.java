package hambap.demo.data.dao;

import hambap.demo.data.entity.Group;


import java.util.List;
import java.util.Optional;

public interface GroupDAO {

    Optional<Group> save(Group group);
    Optional<Group> create(Group group);
    void delete(Group group);
    Optional<List<Group>> findAll();
    Optional<Group> getGroupInfo(Long id);
}