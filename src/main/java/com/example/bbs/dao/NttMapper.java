package com.example.bbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.bbs.dto.AnserDTO;
import com.example.bbs.dto.NttDTO;
import com.example.bbs.dto.NttSerchDTO;

@Mapper
public interface NttMapper {

	
	/**
	 * 게시물 목록 조회
	 */
	public List<NttDTO> listNtt(NttSerchDTO nttSerchDTO);
	
	/**
	 * 게시물 저장
	 * @param nttDTO
	 */
	public void insertNttMst(NttDTO nttDTO);
	
	/**
	 * 게시물 수정
	 * @param nttDTO
	 */
	public void updateNttMst(NttDTO nttDTO);
	
	/**
	 * 게시물 좋아요 정보 저장
	 * @param nttDTO
	 */
	public void insertNttGdniceMst(NttDTO nttDTO);
	
	/**
	 * 게시물 조회 정보 저장
	 * @param nttDTO
	 */
	public void insertNttSerchMst(NttDTO nttDTO);

	/**
	 * 게시물 상세 조회
	 */
	public NttDTO getNtt(NttSerchDTO nttSerchDTO);
	
	/**
	 * 게시물 조회 여부 조회
	 * @param nttDTO
	 * @return
	 */
	public String getNttSerchMst(NttSerchDTO nttSerchDTO);
	
	/**
	 * 댓글저장
	 * @param anserDTO
	 */
	public void insertAnser(AnserDTO anserDTO);
	
	/**
	 * 댓글저장
	 * @param anserDTO
	 */
	public List<AnserDTO> listAnser(AnserDTO anserDTO);
}
