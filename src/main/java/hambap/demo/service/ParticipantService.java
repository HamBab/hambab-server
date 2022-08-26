package hambap.demo.service;

import hambap.demo.data.entity.Participant;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface ParticipantService {

    Optional<Participant> createParticipant(Long groupId);
}
