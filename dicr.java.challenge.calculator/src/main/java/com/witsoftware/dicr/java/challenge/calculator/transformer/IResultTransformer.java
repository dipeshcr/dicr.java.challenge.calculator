package com.witsoftware.dicr.java.challenge.calculator.transformer;

import java.math.BigDecimal;

import com.witsoftware.dicr.java.challenge.calculator.model.Result;
import com.witsoftware.dicr.java.challenge.calculator.model.dto.ResultDTO;

public interface IResultTransformer {

	public abstract Result transformFromDTO(final BigDecimal resultDTO);

	public abstract ResultDTO transformToDTO(final BigDecimal result);
}
