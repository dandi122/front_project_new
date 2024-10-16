package com.example.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.backend.dto.SalesGroupByInterface;
import com.example.backend.entity.Sales;

public interface SalesRepository extends JpaRepository<Sales, Integer>{
	
	@Query("SELECT\r\n"
			+ "    cate category,\r\n"
			+ "    count(cate) cnt,\r\n"
			+ "    round(avg(price), 2) price,\r\n"
			+ "    round(avg(amount), 2) amount\r\n"
			+ "FROM\r\n"
			+ "    Sales \r\n"
			+ "GROUP BY\r\n"
			+ "    cate\r\n"
			+ "ORDER BY\r\n"
			+ "    price desc")
	List<SalesGroupByInterface> findSalesGoupByData();
}
