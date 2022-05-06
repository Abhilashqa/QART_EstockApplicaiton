package com.iiht.StockMarket.services;

import java.time.LocalDate;
import java.util.List;

import com.iiht.StockMarket.dto.CompanyStockDetailsDTO;
import com.iiht.StockMarket.dto.StockPriceDetailsDTO;
import com.iiht.StockMarket.dto.StockPriceIndexDTO;

public interface StockMarketService 
{
	public StockPriceDetailsDTO saveStockPriceDetails(StockPriceDetailsDTO stockPriceDetailsDTO);
	public List<StockPriceDetailsDTO> getStockByCode(Long companyCode);
	public StockPriceIndexDTO getStockPriceIndex(Long companyCode, LocalDate startDate, LocalDate endDate);
	public List<StockPriceDetailsDTO> getAllStocksByCompanyCode(Long companyCode);
	public CompanyStockDetailsDTO getAllStocksDetailsByCompanyCode(Long companyCode);
}