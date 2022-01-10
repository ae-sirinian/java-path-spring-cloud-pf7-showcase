package gr.codelearn.spring.cloud.showcase.loyalty.service.rule;

import gr.codelearn.spring.cloud.showcase.core.domain.BaseModel;

import java.math.BigDecimal;

public interface Rule<T extends BaseModel> {
	default Float getDiscountPercent() {
		return 0F;
	}

	default BigDecimal getDiscountAmount() {
		return BigDecimal.ZERO;
	}

	default boolean matches(T target) {
		return false;
	}

	default Long getPriority() {
		return 1L;
	}
}
