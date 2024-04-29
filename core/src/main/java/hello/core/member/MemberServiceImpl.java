package hello.core.member;

public class MemberServiceImpl implements MemberService{

    // 회원 저장소
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {

//        Member Member = memberRepository.findById(memberId);
//
//        return Member;

        return memberRepository.findById(memberId);
    }
}
