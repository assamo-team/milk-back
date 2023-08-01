package com.example.bbs.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "댓글 DTO")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnserDTO {
	
	/**
	 * 댓글
	 */
	@Schema(description = "게시물 일련번호", example = "")
	private int nttSen;
	@Schema(description = "상위댓글 일련번호", example = "")
	private int parentAnserSen;
	@Schema(description = "댓글 일련번호", example = "")
	private int anserSen;
	@Schema(description = "댓글작성자", example = "")
	private String writerNam;
	@Schema(description = "댓글내용", example = "")
	private String anserContents;
	@Schema(description = "입력아이디", example = "")
	private String inpId;
	@Schema(description = "입력일시", example = "")
	private String inpDt;
	
	@Schema(description = "순서", example = "")
	private int sort;
	@Schema(description = "레벨", example = "")
	private int lv;

}
