package com.dbinfocompany.dbinfo.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbinfocompany.dbinfo.domain.member.MemberDto;
import com.dbinfocompany.dbinfo.repository.member.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	private final MemberRepository memberRepository;
	
	@Autowired
	public MemberServiceImpl(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	@Override
	public int write(MemberDto memberDto) throws Exception {
		return memberRepository.insert(memberDto);
	}
	
	@Override
	public MemberDto read(String memberId) throws Exception {
		MemberDto memberDto = memberRepository.selectOne(memberId);
		return memberDto;
	}

	@Override
	public int modify(MemberDto memberDto) throws Exception {
		return memberRepository.update(memberDto);
	}

	@Override
	public int remove(Integer num) throws Exception {
		return memberRepository.delete(num);
	}

	@Override
	public List<MemberDto> getList() throws Exception {
		return memberRepository.selectAll();
	}
}