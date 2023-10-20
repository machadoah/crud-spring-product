package com.medium.machadoah.crudtutorial.domain.product;

import com.medium.machadoah.crudtutorial.dto.RequestProductDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "product")
@Entity(name = "product")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer price_in_cents;

    private Boolean active;

    public Product(RequestProductDTO data){
        this.name = data.name();
        this.price_in_cents = data.price_in_cents();
        this.active = true;
    }
}
