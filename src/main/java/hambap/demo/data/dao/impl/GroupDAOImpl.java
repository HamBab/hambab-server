package hambap.demo.data.dao.impl;

import hambap.demo.data.dao.GroupDAO;
import hambap.demo.data.entity.Group;
import hambap.demo.data.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
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

    public Optional<Group> create(Group group) {
        Optional<Group> newGroup = Optional.of(groupRepository.save(group));
        return newGroup;
    }


    @Override
    public void delete(Group group) {
        groupRepository.delete(group);
    }

    @Override
    public Optional<List<Group>> findAll() {
        return Optional.of(groupRepository.findAll());
    }

    @Override
    public Optional<Group> getGroupInfo(Long id) {
        Optional<Group> info = groupRepository.findById(id);
        return info;
    }
}
