package com.example.RecruitmentManagementSystem;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyMasterDbServices extends MongoRepository<CompanyMaster, String> {

}
