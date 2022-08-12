package hambap.demo.service;

import hambap.demo.data.entity.Member;

import java.util.Optional;

public interface MemberService {

    Optional<Member> findMember(Long id);
}
