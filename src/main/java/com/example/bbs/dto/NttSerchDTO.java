package com.example.bbs.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "게시물 조회조건 DTO")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NttSerchDTO {
	
	/**
	 * 게시물 조회조건
	 */
	@Schema(description = "게시물 일련번호", example = "")
	private int nttSen;
	@Schema(description = "상위게시판 일련번호", example = "")
	private int parentNttSen;
	@Schema(description = "지역 일련번호", example = "")
	private int areaSen;
	@Schema(description = "게시판 일련번호", example = "")
	private int bbsSen;
	@Schema(description = "ip 주소", example = "")
	private String ipAddr;

}
