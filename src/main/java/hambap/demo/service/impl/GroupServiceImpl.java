package hambap.demo.service.impl;

import hambap.demo.data.dao.GroupDAO;
import hambap.demo.data.entity.Group;
import hambap.demo.service.GroupService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupServiceImpl implements GroupService {

    private final GroupDAO groupDAO;

    public GroupServiceImpl(GroupDAO groupDAO) {
        this.groupDAO = groupDAO;
    }

    @Override
    public Optional<List<Group>> findAllGroups() {
        return groupDAO.findAll();
    }

    @Override
    public Optional<Group> createGroup(Long restaurantId, Long leaderId) {

        Group group = new Group();
        group.setName("");
        group.setDate("1970-01-01");
        group.setTime("");
        group.setSex('F');
        group.setAge("");
        group.setPersonnel(1);
        group.setOptional("");
        group.setLeader(leaderId);
        group.setRestaurantId(restaurantId);

        return groupDAO.create(group);
    }

    @Override
    public Optional<Group> findGroupById(Long id) {
        return groupDAO.getGroupInfo(id);
    }
}
