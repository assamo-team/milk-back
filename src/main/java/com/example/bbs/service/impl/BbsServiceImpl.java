package com.example.bbs.service.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bbs.dao.BbsMapper;
import com.example.bbs.dto.AreaDTO;
import com.example.bbs.dto.BbsDTO;
import com.example.bbs.service.BbsService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
public class BbsServiceImpl implements BbsService{

	private final BbsMapper bbsMapper;
	
	@Transactional(readOnly = true)
	@Override
	public List<BbsDTO> listBbsMst() {
		// TODO Auto-generated method stub
		return bbsMapper.listBbsMst();
	}

	@Transactional(readOnly = true)
	@Override
	public BbsDTO getBoard(String bbsSen) {
		// TODO Auto-generated method stub
		return bbsMapper.getBoard(bbsSen);
	}

	@Transactional()
	@Override
	public BbsDTO saveBoard(BbsDTO bbsDTO) {
		// TODO Auto-generated method stub
		
		bbsDTO.setUpdId(8811);
		bbsDTO.setInpId(8811);
		
		if (bbsDTO.getBbsSen() != 0) {
			
			bbsMapper.updateBbsMst(bbsDTO);
		} else {
			bbsMapper.insertBbsMst(bbsDTO);
		}
		
		if (bbsDTO.getOptnSen() != 0) {
			bbsMapper.updateBbsOptn(bbsDTO);
			
		} else {
			bbsMapper.insertBbsOptn(bbsDTO);
		}
		
		return bbsDTO;
		
	}

	@Transactional()
	@Override
	public void deleteBoard(String bbsSen) {
		// TODO Auto-generated method stub
		
		bbsMapper.deleteBbsOptn(bbsSen);
		
		bbsMapper.deleteBbsMst(bbsSen);
		
	}

	@Transactional(readOnly = true)
	@Override
	public List<AreaDTO> listAreaMst() {
		// TODO Auto-generated method stub
		return bbsMapper.listAreaMst();
	}

	@Transactional(readOnly = true)
	@Override
	public AreaDTO getArea(String areaSen) {
		// TODO Auto-generated method stub
		return bbsMapper.getArea(areaSen);
	}

	@Transactional()
	@Override
	public AreaDTO saveArea(AreaDTO areaDTO) {
		// TODO Auto-generated method stub
		if (areaDTO.getAreaSen() != 0) {
			
			bbsMapper.updateAreaMst(areaDTO);
		} else {
			bbsMapper.insertAreaMst(areaDTO);
		}
		
		return areaDTO;
	}

	@Transactional()
	@Override
	public void deleteArea(String areaSen) {
		// TODO Auto-generated method stub
		bbsMapper.deleteArea(areaSen);
	}

}
