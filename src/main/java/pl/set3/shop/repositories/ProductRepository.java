package pl.set3.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.set3.shop.entities.Product;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByName(String name);
    List<Product> findAllByOrderById();
}
