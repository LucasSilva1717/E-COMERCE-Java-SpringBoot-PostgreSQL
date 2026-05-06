package application.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository <Order, Long> {
    
}   