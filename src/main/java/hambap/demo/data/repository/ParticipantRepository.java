package hambap.demo.data.repository;

import hambap.demo.data.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {


    Participant save(Participant participant);
}
