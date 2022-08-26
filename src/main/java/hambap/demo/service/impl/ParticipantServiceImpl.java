package hambap.demo.service.impl;

import hambap.demo.data.dao.ParticipantDAO;
import hambap.demo.data.entity.Participant;
import hambap.demo.service.ParticipantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ParticipantServiceImpl implements ParticipantService {

    private final ParticipantDAO participantDAO;

    public ParticipantServiceImpl(ParticipantDAO participantDAO) {

        this.participantDAO = participantDAO;
    }


    @Override
    public Optional<Participant> createParticipant(Long groupId) {

        Participant participant = new Participant();
        participant.setId(groupId);
        System.out.println("완");
        return participantDAO.create(participant);
    }
}
