package io.paideia.leads.repository;

import io.paideia.leads.repository.entity.Lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<Lead, Long> {
}
