package hambap.demo.data.dao.impl;

import hambap.demo.data.dao.GroupDAO;
import hambap.demo.data.entity.Group;
import hambap.demo.data.entity.Member;
import hambap.demo.data.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GroupDAOImpl implements GroupDAO {

    private final GroupRepository groupRepository;

    @Autowired
    public GroupDAOImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public Optional<Group> save(Group group) {
        Optional<Group> newGroup = Optional.of(groupRepository.save(group));
        return newGroup;
    }
}