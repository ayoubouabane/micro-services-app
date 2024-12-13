package net.ouabane.billingservice.repository;

import net.ouabane.billingservice.entities.BILL;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<BILL, Long> {
}
