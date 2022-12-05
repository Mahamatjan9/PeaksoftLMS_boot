package com.example.peaksoftlms_boot.service;

import com.example.peaksoftlms_boot.model.Company;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {

    List<Company> getAllCompanies();

    void addCompany(Company company);

    Company getCompanyById(Long id);

    void updateCompany(Company company);

    void deleteCompany(Long id);
}
