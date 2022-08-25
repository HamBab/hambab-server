package hambap.demo.service;

import hambap.demo.data.dao.MemberDAO;
import hambap.demo.data.entity.Member;
import hambap.demo.data.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberDAO memberDAO;

    public Long login(String userId, String password) {
       Member member = memberDAO.findByUserId(userId)
                .filter(m -> m.getPassword().equals(password))
                .orElse(null);

       return member.getId();
    }
}
