package hambap.demo.controller;

import hambap.demo.data.entity.Participant;
import hambap.demo.service.ParticipantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/participant")
public class ParticipantController {

    private final ParticipantService participantService;

    @GetMapping("/{groupId}")
    public Optional<Participant> createParticipant(@PathVariable Long groupId) {
        return participantService.createParticipant(groupId);
    }


}