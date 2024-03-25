package com.multi.member;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
	int insertMember(MemberDTO dto);
	MemberDTO selectMember(Map<String, String> map);
}
