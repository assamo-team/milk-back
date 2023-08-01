package com.example.bbs.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "게시판 DTO")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BbsDTO {
	
	/**
	 * 게시판 마스터
	 */
	@Schema(description = "게시판 일련번호", example = "")
	private int bbsSen;
	@Schema(description = "상위게시판 일련번호", example = "")
	private int parentBbsSen;
	@Schema(description = "게시판 유형", example = "")
	private String bbsTyCd;
	@Schema(description = "게시판 유형명", example = "")
	private String bbsTyNae;
	@Schema(description = "게시판 명", example = "")
	private String bbsNae;
	@Schema(description = "게시판 설명", example = "")
	private String bbsDescript;
	@Schema(description = "게시판 순서", example = "")
	private int sortOrd;

	@Schema(description = "입력아이디", example = "")
	private int inpId;
	@Schema(description = "생성일시", example = "")
	private String inpDt;
	
	@Schema(description = "수정아이디", example = "")
	private int updId;
	@Schema(description = "수정일시", example = "")
	private String updDt;
	
	/**
	 * 게시판 옵션
	 */
	@Schema(description = "게시판옵션일련번호", example = "")
	private int optnSen;
	
	@Schema(description = "좋아요기능사용여부", example = "")
	private String gdniceUseYn;
	
	@Schema(description = "좋아요기능점수", example = "")
	private int gdniceScr;
	
	@Schema(description = "좋아요상위수", example = "")
	private int gdniceUppNum;
	
	@Schema(description = "비밀글사용여부", example = "")
	private String scrtartcFnctYn;
	
	@Schema(description = "댓글사용여부", example = "")
	private String anserFnctYn;
	
	@Schema(description = "답글사용여부", example = "")
	private String answerFnctYn;
	
	@Schema(description = "익명사용여부", example = "")
	private String annymtyFnctYn;
	
	@Schema(description = "신고사용여부", example = "")
	private String sttemntFnctYn;
	
	@Schema(description = "신고기능숨김횟수", example = "")
	private int sttemntFnctTsNum;

}
