package hambap.demo.data.dao;

import hambap.demo.data.entity.Member;

import java.util.Optional;

public interface MemberDAO {

    Optional<Member> save(Member member);
    Optional<Member> findByUserId(String userId);
    Optional<Member> findMember(Long id);
}
