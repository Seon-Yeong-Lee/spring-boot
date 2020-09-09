package sy.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sy.hello.domain.Member;

import java.util.Optional;


public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    Optional<Member> findByName(String name);

}
