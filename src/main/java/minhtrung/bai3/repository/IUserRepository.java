package minhtrung.bai3.repository;

import minhtrung.bai3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    @Query("Select u FROM User u WHERE u.username=?1")
    User findByUsername(String username);
}
