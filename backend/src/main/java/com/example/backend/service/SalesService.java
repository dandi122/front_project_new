package com.example.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.dto.SalesGroupBy;
import com.example.backend.dto.SalesGroupByInterface;
import com.example.backend.repository.SalesRepository;

@Service
public class SalesService {
	
	@Autowired
	private SalesRepository salesRepository;
	
	public List<SalesGroupBy> getSalesGroupBy() {
		List<SalesGroupByInterface> sales = salesRepository.findSalesGoupByData();
		List<SalesGroupBy> res = new ArrayList<SalesGroupBy>();
		for(SalesGroupByInterface sale : sales) {
			SalesGroupBy data = SalesGroupBy.builder()
					.category(sale.getCategory())
					.cnt(sale.getCnt())
					.price(sale.getPrice())
					.amount(sale.getAmount())
					.build();
			res.add(data);
			
		}
		return res;
		
	}

}
