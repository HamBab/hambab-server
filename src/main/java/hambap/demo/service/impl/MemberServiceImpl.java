package hambap.demo.service.impl;

import hambap.demo.data.dao.MemberDAO;
import hambap.demo.data.entity.Member;
import hambap.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberDAO memberDAO;

    @Autowired
    public MemberServiceImpl(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    @Override
    public Optional<Member> findMember(Long id) {

        Optional<Member> member = memberDAO.findMember(id);
        return member;
    }
}
