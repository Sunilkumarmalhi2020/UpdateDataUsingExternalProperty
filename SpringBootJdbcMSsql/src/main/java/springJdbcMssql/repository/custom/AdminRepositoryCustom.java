package springJdbcMssql.repository.custom;

import java.util.List;
import springJdbcMssql.model.Admin;
public interface AdminRepositoryCustom {

	List<Admin> findAllAdmin();
	public String UpdateEmail(String email,int id);
}
