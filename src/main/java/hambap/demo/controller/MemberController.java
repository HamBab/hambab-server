package hambap.demo.controller;

import hambap.demo.data.entity.Member;
import hambap.demo.service.LoginService;
import hambap.demo.service.MemberService;
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
    private final LoginService loginService;

    @GetMapping("/{id}")
    public Optional<Member> findMemberById(@PathVariable Long id) {
        return memberService.findMember(id);
    }

    @GetMapping("login/{userId}/{password}")
    public Long find(@PathVariable String userId, @PathVariable String password) {
        return loginService.login(userId, password);
    }
}
