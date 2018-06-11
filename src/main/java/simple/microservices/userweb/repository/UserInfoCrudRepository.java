package simple.microservices.userweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import simple.microservices.userweb.model.UserInfo;

import java.util.List;

@Transactional
public interface UserInfoCrudRepository extends CrudRepository<UserInfo, Integer> {

    UserInfo getById(int id);
    List<UserInfo> findAll();
    boolean existsById(int id);
    void deleteById(int id);
}
