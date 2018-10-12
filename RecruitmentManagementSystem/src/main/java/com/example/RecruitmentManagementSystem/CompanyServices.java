package com.example.RecruitmentManagementSystem;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rms.beans.JobRequirements;




@RestController
public class CompanyServices {
	
	@Autowired
	CompanyMasterDbServices companyDao;
	@Autowired
	JobRequirementsDbServices jobRequirementsDao;
	@PostMapping("/insertCompanyDetails/{companyId}")
	public String insert(@RequestBody CompanyMaster companyMaster,@PathVariable("companyId") String companyId)
	{
		Optional<CompanyMaster> em=companyDao.findById(companyId);
        if(!em.isPresent())
        {
           
            companyDao.save(companyMaster);
            
            return " Successfully Inserted";
        }
        else
        {
           
            return " UnSuccessful, Id already exist, please enter another Id";
        }
    
     
		
	}
	
	@PostMapping("/insertJobRequirements/{jobId}")
	public String insert(@RequestBody JobRequirements jobRequirements,@PathVariable("jobId") String jobId)
	{
		
		Optional<JobRequirements> jobReq=jobRequirementsDao.findById(jobId);
		if(!jobReq.isPresent()){
			jobRequirementsDao.save(jobRequirements);
			return " Successfully Inserted";
		}
		else
		{
			return " UnSuccessful, Id already exist, please enter another Id";
		
		}	
	}
	@PostMapping("/search/{qualification}/{position}/{experience}")
	public String search(@PathVariable("qualification") String qualification,@PathVariable("position") String position,@PathVariable("experience") int experience)
	{
		ArrayList<CandidateQualifications> qList=
		
		
		return "";
	}
	
}
