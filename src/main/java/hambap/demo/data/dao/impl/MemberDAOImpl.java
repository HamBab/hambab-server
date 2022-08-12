package hambap.demo.data.dao.impl;

import hambap.demo.data.dao.MemberDAO;
import hambap.demo.data.entity.Member;
import hambap.demo.data.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MemberDAOImpl implements MemberDAO {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberDAOImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Optional<Member> findMember(Long id) {

        Optional<Member> member = memberRepository.findById(id);

        return member;
    }
}
