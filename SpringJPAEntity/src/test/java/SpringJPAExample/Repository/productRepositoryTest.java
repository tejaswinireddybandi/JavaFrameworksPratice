package SpringJPAExample.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest // To load all the application context
// because we want to inject some of the Spring bean in this class.
@DataJpaTest
class productRepositoryTest
{
    @Autowired//To use the ProductRepository we need to use the autowired Annotation.
    // here we are doing the Dependency injection.
    private productRepository productRepository;

}