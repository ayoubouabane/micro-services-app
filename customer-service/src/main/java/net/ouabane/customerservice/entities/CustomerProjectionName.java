package net.ouabane.customerservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "name",types = Customer.class)
public interface CustomerProjectionName {
    String getName();
}
