package com.example.bbs.web;

import java.util.List;

import org.springdoc.api.annotations.ParameterObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bbs.dto.AnserDTO;
import com.example.bbs.dto.NttDTO;
import com.example.bbs.dto.NttSerchDTO;
import com.example.bbs.service.NttService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Tag(name = "게시물 API", description = "게시물 API")
@RestController
@RequestMapping("/api/bbs/ntt")
public class NttController {

	private final NttService nttService;
	
	@Operation(summary = "게시물 내역 조회", description = "게시물 내역 조회")
	@GetMapping("/list")
	public ResponseEntity<List<NttDTO>> listNtt(@ParameterObject NttSerchDTO nttSerchDTO) {
		
		List<NttDTO> list = nttService.listNtt(nttSerchDTO);
		
		return ResponseEntity.ok(list);
	}
	
	@Operation(summary = "게시물 저장", description = "게시물 저장")
	@PostMapping("/save")
	public ResponseEntity<Void> saveNtt(@RequestBody NttDTO nttDTO) {
		
		nttService.saveNtt(nttDTO);
		
		return ResponseEntity.noContent().build();
	}
	
	@Operation(summary = "게시물 상세 조회", description = "게시물 상세 조회")
	@GetMapping("/getNtt")
	public ResponseEntity<NttDTO> getNtt(@ParameterObject NttSerchDTO nttSerchDTO) {

		NttDTO obj = nttService.getNtt(nttSerchDTO);
		System.out.println(obj);
		
		return ResponseEntity.ok(obj);
	}
	
	@Operation(summary = "댓글 저장", description = "댓글 저장")
	@PostMapping("/saveAnser")
	public ResponseEntity<Void> saveAnser(@RequestBody AnserDTO anserDTO) {
		
		nttService.saveAnser(anserDTO);
		
		return ResponseEntity.noContent().build();
	}
	
	@Operation(summary = "댓글조회", description = "댓글조회")
	@GetMapping("/listAnser")
	public ResponseEntity<List<AnserDTO>> listAnser(@ParameterObject AnserDTO anserDTO) {
		
		
		System.out.println(anserDTO);
		
		List<AnserDTO> list = nttService.listAnser(anserDTO);
		
		return ResponseEntity.ok(list);
	}
}
