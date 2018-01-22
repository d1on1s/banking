package online.denseleznev.banking.dao;

import online.denseleznev.banking.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
