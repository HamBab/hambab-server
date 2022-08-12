package hambap.demo.data.dao;

import hambap.demo.data.entity.Member;

import java.util.Optional;

public interface MemberDAO {

    Optional<Member> findMember(Long id);
}
