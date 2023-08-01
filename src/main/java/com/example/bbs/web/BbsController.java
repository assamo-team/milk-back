package com.example.bbs.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bbs.dto.AreaDTO;
import com.example.bbs.dto.BbsDTO;
import com.example.bbs.service.BbsService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Tag(name = "게시판 API", description = "게시판 API")
@RestController
@RequestMapping("/api/bbs")
public class BbsController {

	private final BbsService bbsService;
	
	@Operation(summary = "게시판 내역 조회", description = "게시판 내역 조회")
	@GetMapping("/list")
	public ResponseEntity<List<BbsDTO>> listBbs() {
		
		List<BbsDTO> list = bbsService.listBbsMst();
		
		return ResponseEntity.ok(list);
	}
	
	@Operation(summary = "게시판 상세 조회", description = "게시판 상세 조회")
	@GetMapping("/getBoard/{bbsSen}")
	public ResponseEntity<BbsDTO> getBoard(@Parameter(description="게시판 일련번호", example = "1", required = true) @PathVariable(required = true) String bbsSen) {
		
		BbsDTO obj = bbsService.getBoard(bbsSen);
		
		return ResponseEntity.ok(obj);
	}
	
	@Operation(summary = "게시판 설정 저장", description = "게시판 설정 저장")
	@PostMapping("/saveBoard")
	public ResponseEntity<BbsDTO> saveBoard(@RequestBody BbsDTO bbsDTO) {
		
		BbsDTO obj = bbsService.saveBoard(bbsDTO);
		
		System.out.println(obj);
		return ResponseEntity.ok(obj);
	}
	
	@Operation(summary = "게시판 설정 삭제", description = "게시판 설정 삭제")
	@DeleteMapping("/deleteBoard/{bbsSen}")
	public ResponseEntity<Void> deleteBoard(@Parameter(description = "게시판 일련번호", example = "1", required = true) @PathVariable(required = true) String bbsSen) {
		bbsService.deleteBoard(bbsSen);
		return ResponseEntity.noContent().build();
	}
	
	@Operation(summary = "지역 목록 조회", description = "지역 목록 조회")
	@GetMapping("/listArea")
	public ResponseEntity<List<AreaDTO>> listArea() {
		
		List<AreaDTO> list = bbsService.listAreaMst();
		
		return ResponseEntity.ok(list);
	}
	
	@Operation(summary = "지역 상세 조회", description = "지역 상세 조회")
	@GetMapping("/getArea/{areaSen}")
	public ResponseEntity<AreaDTO> getArea(@Parameter(description="지역 일련번호", example = "1", required = true) @PathVariable(required = true) String areaSen) {
		
		AreaDTO obj = bbsService.getArea(areaSen);
		
		return ResponseEntity.ok(obj);
	}
	
	@Operation(summary = "지역 설정 저장", description = "지역 설정 저장")
	@PostMapping("/saveArea")
	public ResponseEntity<AreaDTO> saveArea(@RequestBody AreaDTO areaDTO) {
		
		AreaDTO obj = bbsService.saveArea(areaDTO);
		
		System.out.println(obj);
		return ResponseEntity.ok(obj);
	}
	
	@Operation(summary = "지역 설정 삭제", description = "지역 설정 삭제")
	@DeleteMapping("/deleteArea/{bbsSen}")
	public ResponseEntity<Void> deleteArea(@Parameter(description = "지역 일련번호", example = "1", required = true) @PathVariable(required = true) String areaSen) {
		bbsService.deleteArea(areaSen);
		return ResponseEntity.noContent().build();
	}
	
}
