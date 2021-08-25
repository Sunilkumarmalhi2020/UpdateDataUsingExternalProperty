package springJdbcMssql.repository.custom;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import springJdbcMssql.model.Admin;

public class AdminRepositoryImpl implements AdminRepositoryCustom {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Admin> findAllAdmin() {
		String sql="select AdminId,AdminName,Email from Admin";
		List<Admin> list=jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Admin.class));
		return list;
	}

	@Override
	public String UpdateEmail(String email, int id) {
		String sql="update Admin set Email=? where AdminId=?";
		jdbcTemplate.update(sql,email,id);
		return "record updated";
	}

}
