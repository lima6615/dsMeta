package com.devsuperior.dsmeta.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmeta.dto.SaleDTO;
import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;

	@Transactional(readOnly = true)
	public List<SaleDTO >findAll() {
		List<Sale> entity = repository.findAll();
		List<SaleDTO> dto = entity.stream().map(x -> new SaleDTO(x)).collect(Collectors.toList());
		return dto;
	}

}
