package SpringJPAExample.Entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(
        name= "product", // customized table name. if not given it will take as default table name as className.
        schema = "ExampleDemo123", // Name that we gave in the database to create the DB which is schema.
        uniqueConstraints= {
                @UniqueConstraint(
                        name = "sku_unique",
                        columnNames = "Stock_Keeping_Unit"
                )// If you want to create the multiple uniqueConstraints Then We have to add same as both
        }

)
public class product {

    @Id
    // Primary Key as A id.
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "Product_generator")
    //Sequence table creation. If we didn't maintain this hibernate will maintain default Sequence Table.
    @SequenceGenerator(name = "Product_generator",
            sequenceName = "Product_sequence_name",
            allocationSize = 1)

    private Long id;
    //not a null variable as SKU and name also customized.
    @Column(name = "Stock_Keeping_Unit", nullable = false)
    private String sku;
    @Column(nullable = false)
    private String name;
    private String description;
    private BigDecimal price;
    private boolean active;
    private String imageURL;
    @CreationTimestamp
    private LocalDateTime dateCreated;
    @UpdateTimestamp
    private LocalDateTime lastCreated;

    /*public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getLastCreated() {
        return lastCreated;
    }

    public void setLastCreated(LocalDateTime lastCreated) {
        this.lastCreated = lastCreated;
    }
*/
}



