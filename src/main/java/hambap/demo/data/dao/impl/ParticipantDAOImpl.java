package hambap.demo.data.dao.impl;

import hambap.demo.data.dao.ParticipantDAO;

import hambap.demo.data.entity.Group;
import hambap.demo.data.entity.Participant;
import hambap.demo.data.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ParticipantDAOImpl implements ParticipantDAO {

    private final ParticipantRepository participantRepository;

    @Autowired
    public ParticipantDAOImpl(ParticipantRepository participantRepository) {
        this.participantRepository = participantRepository;
    }

    @Override
    public Optional<Participant> create(Participant participant) {
        Optional<Participant> newParticipant = Optional.of(participantRepository.save(participant));
        return newParticipant;
    }

}
