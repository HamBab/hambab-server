package hambap.demo.data.dao;

import hambap.demo.data.entity.Participant;

import java.util.Optional;

public interface ParticipantDAO {

    Optional<Participant> create(Participant participant);
}