package springJdbcMssql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springJdbcMssql.model.Admin;
import springJdbcMssql.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	public List<Admin> getAllRecords(){
		return adminRepository.findAllAdmin();
	}
	
	public String updateEmail(String email,int id) {
		return adminRepository.UpdateEmail(email, id);
	}
}
