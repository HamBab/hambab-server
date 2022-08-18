package hambap.demo.controller;

import hambap.demo.data.entity.Member;
import hambap.demo.service.MemberService;
import hambap.demo.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/signup/{userId}")
    public String signUp(@PathVariable String userId) {
        return memberService.signUp(userId);
    }

    @GetMapping("/{id}")
    public Optional<Member> findMemberById(@PathVariable Long id) {
        return memberService.findMember(id);
    }
}
