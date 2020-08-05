package sy.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sy.hello.repository.MemberRepository;
import sy.hello.repository.MemoryMemberRepository;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
