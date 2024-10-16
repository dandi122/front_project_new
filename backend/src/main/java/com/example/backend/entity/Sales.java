package com.example.backend.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Sales {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer order_id;
	
	private LocalDateTime indate;
	
	private String cate;
	
	private Integer itemcode;
	
	private Integer price;
	
	private Integer amount;

}
