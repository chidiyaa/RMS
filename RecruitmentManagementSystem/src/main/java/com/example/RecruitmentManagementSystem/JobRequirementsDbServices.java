package com.example.RecruitmentManagementSystem;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobRequirementsDbServices extends MongoRepository<JobRequirements, String> {

}
