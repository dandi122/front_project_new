/**
 * sql 수행 결과를 받아줄 dto
 * 수행 결과를 1대 1로 받아줄 엔티티는 존재하지 않음 -> dto로 대체 처리
 * 만약 dto로 데이터가 입력되지 않으면, 동일 컬럼명의 인터페이스를 구축(getter만 구현)하여 받아준다
 */
package com.example.backend.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class SalesGroupBy {
	private String category;
	private int cnt;
	private float price;
	private float amount;
	
	@Builder
	public SalesGroupBy(String category, int cnt, float price, float amount) {
		super();
		this.category = category;
		this.cnt = cnt;
		this.price = price;
		this.amount = amount;
	}
	
	
}
