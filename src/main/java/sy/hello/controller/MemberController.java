package sy.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sy.hello.MemberService;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    /*
        DI의 세가지 방법
        - 필드 주입 (비추)
        - setter 주입
        - 생성자 주입
     */

}