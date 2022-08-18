package hambap.demo.service.impl;

import hambap.demo.data.dao.MemberDAO;
import hambap.demo.data.entity.Member;
import hambap.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberDAO memberDAO;

    @Autowired
    public MemberServiceImpl(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    @Override
    public String signUp(String userId) {
        //validate
        if (memberDAO.findByUserId(userId).isPresent()) {
            return "존재";
        }
        //save
        Member member = new Member();
        member.setUserId(userId);
        member.setName("ss");
        member.setNickname("nn");
        member.setPassword("password");
        member.setAge(5040);
        member.setSex('F');

        Optional<Member> newMember = memberDAO.save(member);
        return "회원가입 성공";
    }

    @Override
    public Optional<Member> findMember(Long id) {

        Optional<Member> member = memberDAO.findMember(id);
        return member;
    }
}
