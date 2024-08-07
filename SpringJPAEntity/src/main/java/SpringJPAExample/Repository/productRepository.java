package SpringJPAExample.Repository;

import SpringJPAExample.Entity.product;
import org.springframework.data.jpa.repository.JpaRepository;
//here we don't have to again annotate with the repository annotation because in simpleJPARepository it was implemented by default with repository annotation.
//after adding this productRepository we will get all the methods to perform the CRUD
public interface productRepository extends JpaRepository<product, Long> {
}

