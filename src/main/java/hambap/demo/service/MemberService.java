package hambap.demo.service;

import hambap.demo.data.entity.Member;

import java.util.Optional;

public interface MemberService {

    String signUp(String userId);
    Optional<Member> findMember(Long id);
}
