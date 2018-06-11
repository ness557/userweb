package simple.microservices.userweb.service;

import simple.microservices.userweb.model.Role;

import java.util.List;

public interface RoleService {

    Status saveRole(Role role);
    Status removeRole(Role role);
    Status removeRole(int id);
    Role getRoleById(int id);
    Role findRoleByName(String name);
    List<Role> getRoles();

}
