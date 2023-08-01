package com.example.bbs.service;

import java.util.HashMap;
import java.util.List;

import com.example.bbs.dto.AreaDTO;
import com.example.bbs.dto.BbsDTO;


public interface BbsService {

	
	/**
	 * 게시판마스터 목록 조회
	 */
	public List<BbsDTO> listBbsMst();
	
	/**
	 * 게시판 상세조회
	 * @param bbsSen
	 * @return
	 */
	public BbsDTO getBoard(String bbsSen);
	
	/**
	 * 게시판 설정 저장
	 * @param bbsDTO
	 */
	public BbsDTO saveBoard(BbsDTO bbsDTO);
	
	/**
	 * 게시판 설정 삭제
	 * @param bbsSen
	 */
	public void deleteBoard(String bbsSen);
	
	/**
	 * 지역 목록 조회
	 * @return
	 */
	public List<AreaDTO> listAreaMst();
	
	/**
	 * 지역 상세조회
	 * @param areaSen
	 * @return
	 */
	public AreaDTO getArea(String areaSen);
	
	/**
	 * 지역 설정 저장
	 * @param areaDTO
	 */
	public AreaDTO saveArea(AreaDTO areaDTO);
	
	/**
	 * 지역 설정 삭제
	 * @param areaSen
	 */
	public void deleteArea(String areaSen);
}
