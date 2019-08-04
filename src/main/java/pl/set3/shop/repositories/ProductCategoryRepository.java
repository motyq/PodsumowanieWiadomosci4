package pl.set3.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.set3.shop.entities.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
