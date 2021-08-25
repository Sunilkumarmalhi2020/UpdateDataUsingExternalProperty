package springJdbcMssql.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import springJdbcMssql.model.Admin;
import springJdbcMssql.repository.custom.AdminRepositoryCustom;

public interface AdminRepository  extends JpaRepository<Admin, Integer>,AdminRepositoryCustom{

}
