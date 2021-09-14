package hello.core.service;

import hello.core.member.Member;
import hello.core.repository.MemberRepository;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void joinMember(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member fineMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}