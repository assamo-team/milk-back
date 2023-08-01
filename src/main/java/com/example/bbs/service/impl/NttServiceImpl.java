package com.example.bbs.service.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bbs.dao.BbsMapper;
import com.example.bbs.dao.NttMapper;
import com.example.bbs.dto.AnserDTO;
import com.example.bbs.dto.AreaDTO;
import com.example.bbs.dto.BbsDTO;
import com.example.bbs.dto.NttDTO;
import com.example.bbs.dto.NttSerchDTO;
import com.example.bbs.service.BbsService;
import com.example.bbs.service.NttService;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
public class NttServiceImpl implements NttService{

	private final BbsMapper bbsMapper;
	
	private final NttMapper nttMapper;
	
	private final HttpServletRequest request;

	@Transactional(readOnly = true)
	@Override
	public List<NttDTO> listNtt(NttSerchDTO nttSerchDTO) {
		// TODO Auto-generated method stub
		return nttMapper.listNtt(nttSerchDTO);
	}

	@Transactional()
	@Override
	public void saveNtt(NttDTO nttDTO) {
		// TODO Auto-generated method stub
		
		if (nttDTO.getNttSen() > 0) {
			nttMapper.updateNttMst(nttDTO);
		} else {
			insertNttMst(nttDTO);
		}
	}

	@Transactional()
	@Override
	public void insertNttMst(NttDTO nttDTO) {
		// TODO Auto-generated method stub
		nttMapper.insertNttMst(nttDTO);
	}

	@Transactional()
	@Override
	public void insertNttGdniceMst(NttDTO nttDTO) {
		// TODO Auto-generated method stub
		nttMapper.insertNttGdniceMst(nttDTO);
	}

	@Transactional()
	@Override
	public void insertNttSerchMst(NttDTO nttDTO) {
		// TODO Auto-generated method stub
		nttMapper.insertNttSerchMst(nttDTO);
	}
	
	@Transactional(readOnly = true)
	@Override
	public NttDTO getNtt(NttSerchDTO nttSerchDTO) {
		// TODO Auto-generated method stub
		
		String ip = getClientIP();
		
		nttSerchDTO.setIpAddr(ip);
		
		String existsYn = nttMapper.getNttSerchMst(nttSerchDTO);
		
		if ("N".equals(existsYn)) {
			NttDTO nttDTO = NttDTO.builder()
					.userId("8811")
					.nttSen(nttSerchDTO.getNttSen())
					.inpId(8811)
					.ipAddr(ip)
					.build();
			nttMapper.insertNttSerchMst(nttDTO);
		}
		
		return nttMapper.getNtt(nttSerchDTO);
	}
	
	private String getClientIP() {
		
		String ipAddress = request.getHeader("X-FORWARDED-FOR");
		
		if (ipAddress == null) {
			ipAddress = request.getRemoteAddr();
		}
		
		return ipAddress;
	}

	@Transactional()
	@Override
	public void saveAnser(AnserDTO anserDTO) {
		// TODO Auto-generated method stub
		nttMapper.insertAnser(anserDTO);
	}

	@Transactional(readOnly = true)
	@Override
	public List<AnserDTO> listAnser(AnserDTO anserDTO) {
		// TODO Auto-generated method stub
		return nttMapper.listAnser(anserDTO);
	}
	
}
