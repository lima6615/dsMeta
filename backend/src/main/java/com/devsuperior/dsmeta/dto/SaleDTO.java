package com.devsuperior.dsmeta.dto;

import java.time.LocalDate;

import com.devsuperior.dsmeta.entities.Sale;

public class SaleDTO {

	private Long id;
	private LocalDate date;
	private String sellerName;
	private Integer visited;
	private Integer deals;
	private Double amount;
	
	public SaleDTO() {
	}

	public SaleDTO(Long id, LocalDate date, String sellerName, Integer visited, Integer deals, Double amount) {
		this.id = id;
		this.date = date;
		this.sellerName = sellerName;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
	}
	
	public SaleDTO(Sale entity) {
		id = entity.getId();
		date = entity.getDate();
		sellerName = entity.getSellerName();
		visited = entity.getVisited();
		deals = entity.getDeals();
		amount = entity.getAmount();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
