package hambap.demo.service.impl;

import hambap.demo.data.dao.GroupDAO;
import hambap.demo.data.entity.Group;
import hambap.demo.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        Optional<Group> newGroup = groupDAO.save(group);
        return "수정완료";
    }
}