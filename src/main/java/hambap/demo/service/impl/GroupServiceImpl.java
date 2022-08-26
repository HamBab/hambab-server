package hambap.demo.service.impl;

import hambap.demo.data.dao.GroupDAO;
import hambap.demo.data.entity.Group;
import hambap.demo.service.GroupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupServiceImpl implements GroupService {

    private final GroupDAO groupDAO;


    @Autowired
    public GroupServiceImpl(GroupDAO groupDAO) {
        this.groupDAO = groupDAO;
    }

    @Override
    public String updateGroup(String name, Long id) {

        Group group = new Group();
        group.setName("이름");
        group.setDate("2002-09-02");
        group.setTime("15:00");
        group.setSex('M');
        group.setAge("800");
        group.setPersonnel(2);
        group.setOptional("없음");

        Optional<Group> gp = groupDAO.getGroupInfo(id);
        Long leader = gp.get().getLeader();
        Long restaurantId = gp.get().getRestaurantId();

        group.setLeader(leader);
        group.setRestaurantId(restaurantId);

        Optional<Group> newGroup = groupDAO.save(group);
        return "수정완료";
    }

    @Override
    public String deleteGroup(Long id) {
        Optional<Group> gp = groupDAO.getGroupInfo(id);
        groupDAO.delete(gp.orElseThrow());
        return "삭제완료";
    }

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
