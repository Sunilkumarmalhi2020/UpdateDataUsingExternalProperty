package springJdbcMssql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springJdbcMssql.model.Admin;
import springJdbcMssql.service.AdminService;

@RestController
@RequestMapping("/api")

public class AdminController {

	@Autowired
	private AdminService service;
	
	@Value("${app.email}")
	private String email;
	
	@GetMapping("/admins")
	public List<Admin> getAdmins(){
		return service.getAllRecords();
	}
	
	@GetMapping("/updateEmail")
	public String updateEmail() {
		return service.updateEmail(email, 1);
	}
}
