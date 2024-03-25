package com.multi.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MemberDTO {
	private String memberId;
	private String name;
	private String pw;
	private String phone;
	private String email;
	private String regtime;
	
}
