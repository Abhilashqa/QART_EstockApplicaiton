package com.iiht.StockMarket.services;

import com.iiht.StockMarket.dto.CompanyDetailsDTO;

public interface CompanyInfoService {

	public CompanyDetailsDTO saveCompanyDetails(CompanyDetailsDTO companyDetailsDTO);
	public CompanyDetailsDTO deleteCompany(Long companyCode);
	//----------------------------------------------------------------------------
	public CompanyDetailsDTO getCompanyInfoById(Long companyCode);
	
}