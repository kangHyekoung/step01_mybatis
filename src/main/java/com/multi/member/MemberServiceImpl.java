package com.multi.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl{

	@Autowired
	MemberMapper mapper;
	
	//회원가입
	public int insertMember(MemberDTO dto) {
		return mapper.insertMember(dto);
	}
	
	//로그인
	public MemberDTO selectMember(String memberId, String pw) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("memberId", memberId);
		map.put("pw", pw);
		
		return mapper.selectMember(map);
	}
}
