package com.example.bbs.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "지역 DTO")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AreaDTO {
	
	/**
	 * 지역 마스터
	 */
	@Schema(description = "일련번호", example = "")
	private int areaSen;
	@Schema(description = "지역명", example = "")
	private String areaNae;
	@Schema(description = "지역설명", example = "")
	private String areaDescript;
	@Schema(description = "사용여부", example = "")
	private String useYn;
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

}
