package ltw.com.petshop.repository;
import org.hibernate.id.GUIDGenerator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ltw.com.petshop.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, GUIDGenerator>{
    
}
