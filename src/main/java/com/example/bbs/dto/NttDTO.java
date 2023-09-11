package com.example.bbs.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "게시물 DTO")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NttDTO {
	
	/**
	 * 게시물 마스터
	 */
	@Schema(description = "게시물 일련번호", example = "")
	private int nttSen;
	@Schema(description = "상위게시판 일련번호", example = "")
	private int parentNttSen;
	@Schema(description = "지역 일련번호", example = "")
	private int areaSen;
	@Schema(description = "게시판 일련번호", example = "")
	private int bbsSen;
	@Schema(description = "익명기능사용여부", example = "")
	private String annymtyFnctYn;
	@Schema(description = "비밀글기능사용여부", example = "")
	private String scrtartcFnctYn;
	@Schema(description = "삭제여부", example = "")
	private String delYn;
	@Schema(description = "숨김여부", example = "")
	private String hideYn;
	@Schema(description = "공지여부", example = "")
	private String noticeYn;
	@Schema(description = "닉네임", example = "")
	private String ncnmNae;
	@Schema(description = "작성자", example = "")
	private String writerNam;
	@Schema(description = "답글삭제여부", example = "")
	private String answerDelYn;
	@Schema(description = "게시물제목", example = "")
	private String nttSubject;
	@Schema(description = "게시물내용", example = "")
	private String nttContents;
	@Schema(description = "게시물텍스트내용", example = "")
	private String nttTextContents;
	
	@Schema(description = "게시물이미지", example = "")
	private String nttSrc;
	
	@Schema(description = "좋아요갯수", example = "")
	private String niceNum;
	
	@Schema(description = "싫어요갯수", example = "")
	private String unniceNum;
	
	@Schema(description = "좋아요,싫어요 여부", example = "")
	private String gdniceYn;
	
	@Schema(description = "싫어요갯수", example = "")
	private String serchNum;
	
	@Schema(description = "댓글갯수", example = "")
	private String anserNum;

	@Schema(description = "입력아이디", example = "")
	private int inpId;
	@Schema(description = "생성일시", example = "")
	private String inpDt;
	
	@Schema(description = "수정아이디", example = "")
	private int updId;
	@Schema(description = "수정일시", example = "")
	private String updDt;
	
	
	/**
	 * 게시물 좋아요 싫어요 정보
	 */
	
	@Schema(description = "유저아이디", example = "")
	private String userId;
	@Schema(description = "사용여부", example = "")
	private String useYn;
	@Schema(description = "좋아요,싫어요 구분", example = "")
	private String gdniceSec;
	
	
	/**
	 * 게시물 조회 정보
	 */

	@Schema(description = "IP주소", example = "")
	private String ipAddr;

}
