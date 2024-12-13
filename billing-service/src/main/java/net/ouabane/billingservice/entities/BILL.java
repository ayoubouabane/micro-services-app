package net.ouabane.billingservice.entities;


import jakarta.persistence.*;
import lombok.*;
import net.ouabane.billingservice.model.Customer;

import java.util.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class BILL {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;
    private long customerId;
    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItems = new ArrayList<>();
    @Transient
    private Customer customer;
}
