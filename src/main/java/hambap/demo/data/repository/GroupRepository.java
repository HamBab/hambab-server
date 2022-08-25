package hambap.demo.data.repository;

import hambap.demo.data.entity.Group;
import hambap.demo.data.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GroupRepository extends JpaRepository<Group, Long> {

    Group save(Group group);
}
