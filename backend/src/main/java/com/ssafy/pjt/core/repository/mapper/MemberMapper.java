package com.ssafy.pjt.core.repository.mapper;

import java.sql.SQLException;

import com.ssafy.pjt.web.dto.MemberRequestDTO;
import com.ssafy.pjt.web.dto.SignupRequestDTO;

public interface MemberMapper {
	public void joinMember(SignupRequestDTO member) throws SQLException;
	public void joinLawyer(MemberRequestDTO lawyer) throws SQLException;
}
