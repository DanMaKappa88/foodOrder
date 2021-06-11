package hu.flow.academy.foodOrder.repository;

import hu.flow.academy.foodOrder.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
}
